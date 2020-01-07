package com.budwk.sb.example.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wizzer(wizzer.cn)
 * @date 2020/1/7
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
public class ExampleSysApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExampleSysApplication.class, args);
    }

}
