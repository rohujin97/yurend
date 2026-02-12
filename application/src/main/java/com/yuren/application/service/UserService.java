package com.yuren.application.service;

import com.yuren.application.command.SignUpCommand;
import com.yuren.application.mapper.UserMapper;
import com.yuren.application.payload.SignUpPayload;
import com.yuren.application.port.SignUpPort;
import com.yuren.application.usecase.SignUpUsecase;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService implements SignUpUsecase {

    private final SignUpPort signUpPort;

    private static final UserMapper MAPPER = UserMapper.INSTANCE;

    @Override
    @Transactional
    public void signUp(SignUpCommand command) {
        SignUpPayload payload = MAPPER.toPayload(command);
        signUpPort.save(payload);
    }
}
