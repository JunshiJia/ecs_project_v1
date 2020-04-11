package com.junshijia.ecs.process;

import com.junshijia.ecs.domain.Fault2DB;
import com.junshijia.ecs.domain.UpdateData2DB;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

//10301-10871
public class FaultInsert {
    private UpdateData2DB updateData;
    private Set<String> faultEncodingSet;
    private Map<Integer, String> faultMap;
    private Map<String, Integer> faultMaoInverse;
    private Class updateClz;
    //private int oldFirstTrigger;
    //模块的输出
    private List<Fault2DB> fault2DBList;
    private Map<String, Fault2DB> fault2DBMap;

    public FaultInsert(Set<String> faultEncodingSet, Map<Integer, String> faultMap, Map<String, Integer> faultMapInverse) {
        this.faultEncodingSet = faultEncodingSet;
        this.faultMap = faultMap;
        this.faultMaoInverse = faultMapInverse;
        //记录故障已经被清除的list
        this.fault2DBList = new LinkedList<>();
        //记录所有现有故障，但是没有清除的map
        this.fault2DBMap = new HashMap<>();
        //this.oldFirstTrigger = 0;
        try {
            this.updateClz = Class.forName("com.junshijia.ecs.domain.UpdateData2DB");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void setUpdateData(UpdateData2DB updateData) {
        //更新updatae
        this.updateData = updateData;
        //更新后马上遍历一遍所有故障码
        try {
            this.traverseData();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public void traverseData() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        boolean flag;
        String getter;
        Fault2DB tmp;
        //首发故障地址
        int firstTrigger = (int)this.updateData.getHMI_IReg174();
        //如果首发故障不为0
        if(firstTrigger != 0){
            //this.oldFirstTrigger = firstTrigger;
            //首发故障地址对应的HMI tag
            String firstFaultTag = this.faultMap.get(firstTrigger);
            //如果map里没有该tag
            if(this.fault2DBMap.get(firstFaultTag) == null){
                //建立首发故障的node
                tmp = new Fault2DB();
                tmp.setName(firstTrigger<<1);
                tmp.setStartTime(new Date());
                //添加首发故障到故障map
                this.fault2DBMap.put(firstFaultTag, tmp);
            }
            //遍历400多个故障码，观察哪个是1
            for(String tag : faultEncodingSet){
                getter = "is" + tag;
                flag = (boolean)updateClz.getMethod(getter).invoke(this.updateData);
                if(flag){//如果故障位 = 1
                    //如果故障map里没有这个故障，则加入map
                    if(this.fault2DBMap.get(tag) == null){
                        tmp = new Fault2DB();
                        tmp.setName(this.faultMaoInverse.get(tag));
                        tmp.setStartTime(new Date());
                        this.fault2DBMap.put(tag,tmp);
                    }//如果已经有，证明故障没有清除，什么都不做
                }else{//如果故障位 = 0
                    tmp = this.fault2DBMap.get(tag);
                    if(tmp != null){//如果故障位 = 0，但是map里却有这个故障
                        //先从故障map里去掉这个故障
                        this.fault2DBMap.remove(tag);
                        //设置清除时间
                        tmp.setClearTime(new Date());
                        //加入清除故障的表中
                        this.fault2DBList.add(tmp);
                    }//如果故障表里没有该故障，证明故障没出现过，什么都不做
                }
            }
        }else{//如果首发故障已经清0
            if(this.fault2DBMap.size() > 0) {
                Iterator<Map.Entry<String, Fault2DB>> entries = this.fault2DBMap.entrySet().iterator();
                Map.Entry<String, Fault2DB> entry;
                while (entries.hasNext()) {
                    entry = entries.next();
                    tmp = entry.getValue();
                    tmp.setClearTime(new Date());
                    this.fault2DBList.add(tmp);
                }
                //清空map
                this.fault2DBMap.clear();
            }
        }
    }

    public List<Fault2DB> getFault2DBList() {
        return fault2DBList;
    }

    public void setFault2DBList(List<Fault2DB> fault2DBList) {
        this.fault2DBList = fault2DBList;
    }

    public Map<String, Fault2DB> getFault2DBMap() {
        return fault2DBMap;
    }

    public void setFault2DBMap(Map<String, Fault2DB> fault2DBMap) {
        this.fault2DBMap = fault2DBMap;
    }
}
