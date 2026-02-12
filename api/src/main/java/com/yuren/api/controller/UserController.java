package com.yuren.api.controller;

import com.yuren.api.request.SignUpRequest;
import com.yuren.application.command.SignUpCommand;
import com.yuren.api.mapper.UserMapper;
import com.yuren.application.usecase.SignUpUsecase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user-api")
public class UserController {

    private final SignUpUsecase signUpUsecase;

    private static final UserMapper MAPPER = UserMapper.INSTANCE;

    @PostMapping("/sign-up")
    public void signUp(@RequestBody SignUpRequest request) {
        SignUpCommand command = MAPPER.toCommand(request);
        signUpUsecase.signUp(command);
    }
}
