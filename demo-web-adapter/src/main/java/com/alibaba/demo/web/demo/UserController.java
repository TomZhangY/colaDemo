package com.alibaba.demo.web.demo;

import com.alibaba.cola.dto.Response;
import com.alibaba.demo.user.UserInsertDto;
import com.alibaba.demo.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping(value = "/findOne")
    public Response findUser(@RequestParam("name") String name) {
        return userService.findByName(name);
    }

    @PostMapping(value = "/insertOne")
    public Response insertUser(@Validated @RequestBody UserInsertDto dto) {
        return userService.insertOne(dto);
    }
}
