package com.chk.stu.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/26 22:52
 */
@RequestMapping(value = "/demo")
@RestController
public class DemoController {

    @GetMapping("/hello/{msg}")
    public String hello(@PathVariable String msg){
        return "hello" + msg;
    }

}

