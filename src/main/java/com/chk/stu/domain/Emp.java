package com.chk.stu.domain;

import lombok.Data;

import java.util.Date;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/11/28 21:25
 */
@Data
public class Emp {
    private int empNo;
    private String eName;
    private String job;
    private int mgr;
    private Date hireDate;
    private int sal;
    private int comm;
    private int deptNo;

}
