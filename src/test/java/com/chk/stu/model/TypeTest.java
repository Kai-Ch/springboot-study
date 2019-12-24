package com.chk.stu.model;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TypeTest {

    @Test
    public void getOption() {
        List<Type> option = Type.getOption(UserType.OPS);
        System.out.println(option);
    }
}