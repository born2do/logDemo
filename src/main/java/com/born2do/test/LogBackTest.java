package com.born2do.test;

import com.born2do.log.ILogger;
import com.born2do.log.LoggerImpl;

/**
 * @author chenhy
 * @date 2021/3/29
 */
public class LogBackTest {

    private static final ILogger logger = new LoggerImpl(LogBackTest.class);

    public static void main(String[] args) {
        for (int i = 0; i < 100000000; i++) {
            logger.info("batchlog----" + i, "batch");
            logger.info("reportlog----" + i, "report");
        }
    }

}
