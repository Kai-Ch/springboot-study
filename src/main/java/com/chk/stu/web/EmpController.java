package com.chk.stu.web;

import com.chk.stu.domain.Emp;
import com.chk.stu.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/28 21:37
 */
@RequestMapping(value = "/emp")
@RestController
public class EmpController {

    @Autowired
    private IEmpService iEmpService;

    @GetMapping("/all")
    public List<Emp> findAll() {
        return iEmpService.findAll();
    }

    @GetMapping("/{id}")
    public Emp findById(@PathVariable Integer id) {
        return iEmpService.findById(id);
    }
}
