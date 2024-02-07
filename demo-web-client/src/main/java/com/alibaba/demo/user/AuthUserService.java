package com.alibaba.demo.user;


import com.alibaba.cola.dto.SingleResponse;

public interface AuthUserService {

    /**
     * @return
     */
    default SingleResponse<AuthUserDto> findByLoginName(String loginName) {
        return null;
    }
}
