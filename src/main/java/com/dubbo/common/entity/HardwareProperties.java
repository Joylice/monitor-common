package com.dubbo.common.entity;

import java.io.Serializable;

/**
 * @Author: Joylice
 * @Date: 2020/4/8 10:21
 */

public class HardwareProperties implements Serializable {
    private String host;
    private String model;
    private String cpuCounts;
    private String cpuModel;
    private String cpuGHz;
    private String memCounts;
    private String fileCounts;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpuCounts() {
        return cpuCounts;
    }

    public void setCpuCounts(String cpuCounts) {
        this.cpuCounts = cpuCounts;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getCpuGHz() {
        return cpuGHz;
    }

    public void setCpuGHz(String cpuGHz) {
        this.cpuGHz = cpuGHz;
    }

    public String getMemCounts() {
        return memCounts;
    }

    public void setMemCounts(String memCounts) {
        this.memCounts = memCounts;
    }

    public String getFileCounts() {
        return fileCounts;
    }

    public void setFileCounts(String fileCounts) {
        this.fileCounts = fileCounts;
    }
}
