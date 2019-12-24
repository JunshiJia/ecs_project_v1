package com.junshijia.ecs.db_name;


import org.hibernate.cfg.DefaultNamingStrategy;
import org.hibernate.util.StringHelper;

import java.util.Calendar;

public class EcsNameStrategy extends DefaultNamingStrategy {
    /**
     * 如果domain不指定table name就用类名+年+月作为DB的表名
     */

    public static final EcsNameStrategy INSTANCE = new EcsNameStrategy();

    @Override
    public String classToTableName(String className) {
        Calendar cal = Calendar.getInstance();
        return StringHelper.unqualify(className)+cal.get(Calendar.YEAR)+(cal.get(Calendar.MONTH)+1);
    }

}