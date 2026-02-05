package com.yuren.application.service;

import com.yuren.application.command.SignUpCommand;
import com.yuren.application.usecase.SignUpUsecase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements SignUpUsecase {

    @Override
    public void signUp(SignUpCommand command) {
        log.info("singUp: {}", command);
    }
}
