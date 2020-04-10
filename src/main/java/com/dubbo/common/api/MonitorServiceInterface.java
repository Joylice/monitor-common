package com.dubbo.common.api;

import com.dubbo.common.entity.HardwareProperties;
import com.dubbo.common.entity.ServerProperties;

/**
 * @Author: Joylice
 * @Date: 2020/3/31 17:10
 */
public interface MonitorServiceInterface {

    ServerProperties getPCState();

    HardwareProperties getHardwarePro();
}
