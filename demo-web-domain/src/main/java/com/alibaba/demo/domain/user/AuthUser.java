package com.alibaba.demo.domain.user;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class AuthUser implements Serializable {
    private static final long serialVersionUID = 5454155825314635342L;

    private Integer userId;

    private String openId;

    private String loginName;

    private String userName;

    private String password;

    private Date lastLoginTime;

    private Date lastAccessTime;

    private String lastLoginIp;

    private String accountStatus;

    private Integer status;

    private Integer mobileStatus;

    private Integer belongCompanyId;

    private Date createTime;

    private Date updateTime;

    private Integer projectId;

    private String remark;

    private String mobile;

    private String email;

    private Integer totpAuthEnabled;

    private String totpSecretKey;

    private String sessionId;
}
