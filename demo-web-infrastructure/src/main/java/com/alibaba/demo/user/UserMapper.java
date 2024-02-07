package com.alibaba.demo.user;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {

  UserDO findByName(@Param("name") String name);

  int insertOne(UserDO userDo);
}
