package com.budwk.sb.example.sys.controller;

import com.budwk.sb.commons.base.Result;
import com.budwk.sb.sys.models.Sys_dict;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author wizzer(wizzer.cn)
 * @date 2020/1/7
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class SysDictController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/list")
    public Result getList() {
        Result res = restTemplate.getForObject("http://wk-sb-service-sys/sys/dict_list", Result.class);
        if (res.getCode() == 200) {
            List<Sys_dict> list = res.getList("data", Sys_dict.class);
            for (Sys_dict dict : list) {
                log.debug("k={},v={}", dict.getCode(), dict.getName());
            }
        }
        return res;
    }
}
