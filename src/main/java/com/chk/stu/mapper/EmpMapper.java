package com.chk.stu.mapper;

import com.chk.stu.domain.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/28 21:36
 */
@Mapper
public interface EmpMapper {

    @Select("SELECT * FROM emp")
    List<Emp> findAll();

    @Select("SELECT * FROM emp WHERE EMPNO=#{id}")
    Emp findById(int id);
}
