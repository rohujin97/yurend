package com.yuren.api.mapper;

import com.yuren.api.request.SignUpRequest;
import com.yuren.application.command.SignUpCommand;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    SignUpCommand toCommand(SignUpRequest request);
}
