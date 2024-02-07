package com.alibaba.demo.user;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserDO implements Serializable {
    private static final long serialVersionUID = 5454155825314635342L;

    private Long id;

    private String name;

    private Integer age;

    private String mark;

    private Date createTime;

    private Date updateTime;
}
