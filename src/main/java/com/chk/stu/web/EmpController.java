package com.chk.stu.web;

import com.chk.stu.domain.Emp;
import com.chk.stu.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/28 21:37
 */
@RestController("/emp")
public class EmpController {

    @Autowired
    private IEmpService iEmpService;

    @GetMapping("/all")
    @ResponseBody
    public List<Emp> findAll() {
        return iEmpService.findAll();
    }
}
