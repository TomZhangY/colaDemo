package com.alibaba.demo.user;

import com.alibaba.demo.domain.user.AuthUser;
import com.alibaba.demo.domain.user.AuthUserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AuthUserGatewayImpl implements AuthUserGateway {

    private final AuthUserMapper authUserMapper;

    @Override
    @Nullable
    public AuthUser findByLoginName(String loginName) {
        AuthUser authUser = new AuthUser();
        AuthUserDO authUserDO = authUserMapper.findByLoginName(loginName);
        if (authUserDO != null) {
            BeanUtils.copyProperties(authUserDO, authUser);
            return authUser;
        } else {
            return null;
        }
    }
}
