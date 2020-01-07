package com.budwk.sb.sys.controller;

import com.budwk.sb.commons.base.Result;
import com.budwk.sb.sys.service.SysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wizzer(wizzer.cn)
 * @date 2020/1/6
 */
@RestController
@RequestMapping("/sys")
public class SysDictController {
    @Autowired
    private SysDictService sysDictService;

    @GetMapping("/dict_list")
    public Result getDictList() {
        try {
            return Result.success().addData(sysDictService.query());
        } catch (Exception e) {
            return Result.error();
        }
    }
}
