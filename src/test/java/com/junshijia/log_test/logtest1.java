package com.junshijia.log_test;

import org.apache.log4j.Logger;
import org.junit.Test;

public class logtest1 {
    @Test
    public void testLog(){
        Logger log = Logger.getLogger(logtest1.class);
        log.debug("this is debug message");
        log.error("This is error message.");
    }
}
