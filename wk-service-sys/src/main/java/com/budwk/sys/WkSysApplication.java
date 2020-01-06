package com.budwk.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wizzer(wizzer.cn)
 * @date 2020/1/6
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WkSysApplication {
    public static void main(String[] args) {
        SpringApplication.run(WkSysApplication.class, args);
    }
}
