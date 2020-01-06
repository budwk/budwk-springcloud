package com.budwk.sys.controller;

import com.budwk.sb.commons.base.Result;
import com.budwk.sys.service.SysDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wizzer(wizzer.cn)
 * @date 2020/1/6
 */
@RestController
public class SysDictController {
    @Autowired
    private SysDictService sysDictService;

    @GetMapping("/user_list")
    public Object getUserList(){
        try {
            return Result.success().addData(sysDictService.query());
        }catch (Exception e){
            return Result.error();
        }
    }
}
