package com.alibaba.demo.domain.user;

import com.alibaba.demo.user.UserInsertDto;

public interface UserGateway {

    User findByName(String name);

    User insertOne(UserInsertDto dto);
}
