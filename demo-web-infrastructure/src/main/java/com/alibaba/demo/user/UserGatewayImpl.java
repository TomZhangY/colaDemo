package com.alibaba.demo.user;

import com.alibaba.demo.domain.user.User;
import com.alibaba.demo.domain.user.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {

    private final UserMapper userMapper;

    @Nullable
    @Override
    public User findByName(String name) {
        User user = new User();
        UserDO userDO = userMapper.findByName(name);
        if (userDO != null) {
            BeanUtils.copyProperties(userDO, user);
            return user;
        } else {
            return null;
        }
    }

    @Override
    public User insertOne(UserInsertDto dto) {
        UserDO userDO = new UserDO();
        userDO.setName(dto.getName());
        userDO.setAge(dto.getAge());
        userDO.setMark(dto.getMark());
        Date now = new Date();
        userDO.setCreateTime(now);
        userDO.setUpdateTime(now);
        userMapper.insertOne(userDO);

        User user = new User();
        BeanUtils.copyProperties(userDO, user);
        return user;
    }
}
