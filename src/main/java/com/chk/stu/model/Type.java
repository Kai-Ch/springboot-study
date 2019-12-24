package com.chk.stu.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.chk.stu.model.UserType.OPS;

/**
 * @Author:chenkai
 * @description:
 * @Date:2019/12/24 23:18
 */
public enum Type {

    ACTIVE("active"),
    LIVE("live"),
    MIGRATION("migration", OPS);

    private String description;
    private UserType[] exclusives;

    Type(String description, UserType ...exclusive){
        this.description = description;
        this.exclusives = exclusive;
    }

    private List<UserType> getExclusives(Type type){
        return Arrays.asList(type.exclusives);
    }

    static List<Type> getOption(UserType userType){
        return Arrays.stream(Type.values()).filter(e -> e.getExclusives(e).contains(userType)).collect(Collectors.toList());
    }
}
