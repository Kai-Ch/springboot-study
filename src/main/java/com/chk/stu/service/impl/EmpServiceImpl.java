package com.chk.stu.service.impl;

import com.chk.stu.domain.Emp;
import com.chk.stu.mapper.EmpMapper;
import com.chk.stu.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/28 21:32
 */
@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public Emp findById(int id) {
        return empMapper.findById(id);
    }
}
