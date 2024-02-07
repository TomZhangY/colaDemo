package com.alibaba.demo;

import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.demo.domain.user.AuthUser;
import com.alibaba.demo.domain.user.AuthUserGateway;
import com.alibaba.demo.user.AuthUserDto;
import com.alibaba.demo.user.AuthUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthUserServiceImpl implements AuthUserService {

    private final AuthUserGateway authUserGateway;

    @Override
    public SingleResponse<AuthUserDto> findByLoginName(String loginName) {
        AuthUserDto dto = new AuthUserDto();
        AuthUser authUser = authUserGateway.findByLoginName(loginName);
        if (authUser != null) {
            BeanUtils.copyProperties(authUser, dto);
        }
        return SingleResponse.of(dto);
    }
}
