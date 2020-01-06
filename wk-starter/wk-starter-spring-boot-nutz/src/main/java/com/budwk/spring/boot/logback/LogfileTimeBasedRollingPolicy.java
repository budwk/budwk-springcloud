package com.budwk.spring.boot.logback;

import ch.qos.logback.core.rolling.TimeBasedRollingPolicy;
import org.nutz.lang.Lang;

/**
 * @author wizzer(wizzer.cn)
 * @date 2020/1/6
 */
public class LogfileTimeBasedRollingPolicy<E> extends TimeBasedRollingPolicy<E> {
    public LogfileTimeBasedRollingPolicy() {
    }

    public void start() {
        String fileNamePattern = super.getFileNamePattern();
        if (!fileNamePattern.toLowerCase().endsWith(".log")) {
            fileNamePattern = fileNamePattern + "-" + Lang.JdkTool.getProcessId("0") + ".log";
        } else {
            fileNamePattern = fileNamePattern.substring(0, fileNamePattern.length() - 4) + "-" + Lang.JdkTool.getProcessId("0") + ".log";
        }

        super.setFileNamePattern(fileNamePattern);
        super.start();
    }
}
