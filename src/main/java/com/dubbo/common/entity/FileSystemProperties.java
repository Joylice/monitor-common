package com.dubbo.common.entity;

import java.io.Serializable;

/**
 * @Author: Joylice
 * @Date: 2020/4/2 10:07
 */
public class FileSystemProperties implements Serializable {
    private String devName;
    private Long devTotalCounts;
    private Long devFreeCounts;
    private Long devUsedCounts;

    public Long getDevTotalCounts() {
        return devTotalCounts;
    }

    public void setDevTotalCounts(Long devTotalCounts) {
        this.devTotalCounts = devTotalCounts;
    }

    public Long getDevFreeCounts() {
        return devFreeCounts;
    }

    public void setDevFreeCounts(Long devFreeCounts) {
        this.devFreeCounts = devFreeCounts;
    }

    public Long getDevUsedCounts() {
        return devUsedCounts;
    }

    public void setDevUsedCounts(Long devUsedCounts) {
        this.devUsedCounts = devUsedCounts;
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName;
    }
}