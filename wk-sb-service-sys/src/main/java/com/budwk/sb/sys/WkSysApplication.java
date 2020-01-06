package com.budwk.sb.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wizzer(wizzer.cn)
 * @date 2020/1/6
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
public class WkSysApplication {
    public static void main(String[] args) {
        SpringApplication.run(WkSysApplication.class, args);
    }
}
