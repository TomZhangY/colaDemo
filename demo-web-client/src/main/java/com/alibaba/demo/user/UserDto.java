package com.alibaba.demo.user;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {

    private Long id;

    private String name;

    private Integer age;

    private String mark;

    private Date createTime;

    private Date updateTime;
}
