package com.alibaba.demo.user;

import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.demo.domain.user.User;
import com.alibaba.demo.domain.user.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@CatchAndLog
public class UserServiceImpl implements UserService {

    private final UserGateway userGateway;

    @Override
    public SingleResponse<UserDto> findByName(String name) {
        UserDto dto = new UserDto();
        User authUser = userGateway.findByName(name);
        if (authUser != null) {
            BeanUtils.copyProperties(authUser, dto);
        }
        return SingleResponse.of(dto);
    }

    @Override
    public SingleResponse<UserDto> insertOne(UserInsertDto dto) {
        UserDto result = new UserDto();
        User user = userGateway.insertOne(dto);
        BeanUtils.copyProperties(user, result);
        return SingleResponse.of(result);
    }
}
