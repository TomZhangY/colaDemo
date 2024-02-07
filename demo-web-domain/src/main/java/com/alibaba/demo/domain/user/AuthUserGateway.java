package com.alibaba.demo.domain.user;

public interface AuthUserGateway {
    AuthUser findByLoginName(String loginName);
}
