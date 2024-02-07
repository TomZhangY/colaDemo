package com.alibaba.demo.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthUserMapper {

  AuthUserDO findByLoginName(@Param("loginName") String loginName);

}
