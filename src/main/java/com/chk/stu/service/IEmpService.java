package com.chk.stu.service;

import com.chk.stu.domain.Emp;

import java.util.List;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/28 21:32
 */
public interface IEmpService {

    List<Emp> findAll();

    Emp findById(int id);
}
