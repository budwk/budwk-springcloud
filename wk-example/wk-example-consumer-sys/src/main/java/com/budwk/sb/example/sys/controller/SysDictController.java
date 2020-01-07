package com.budwk.sb.example.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author wizzer(wizzer.cn)
 * @date 2020/1/7
 */
@RestController
@RequestMapping("/test")
public class SysDictController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/list")
    public Object getList(){
        return restTemplate.getForObject("http://wk-sb-service-sys/sys/dict_list",Object.class);
    }
}
