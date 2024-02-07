package com.alibaba.demo.user;


import com.alibaba.cola.dto.SingleResponse;

public interface UserService {

    /**
     * 根据name查询用户
     *
     * @return
     */
    default SingleResponse<UserDto> findByName(String name) {
        return null;
    }

    /**
     * 新增用户
     *
     * @param dto
     * @return
     */
    default SingleResponse<UserDto> insertOne(UserInsertDto dto) {
        return null;
    }
}
