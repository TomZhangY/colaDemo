package com.alibaba.demo.web;

import com.alibaba.cola.dto.Response;
import com.alibaba.demo.user.AuthUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth/user")
public class AuthUserController {

    private final AuthUserService authUserService;

    @GetMapping(value = "/findOne")
    public Response findUser(@RequestParam("loginName") String loginName) {
        return authUserService.findByLoginName(loginName);
    }
}
