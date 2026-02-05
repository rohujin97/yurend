package com.yuren.application.usecase;

import com.yuren.application.command.SignUpCommand;

public interface SignUpUsecase {
    void signUp(SignUpCommand command);
}
