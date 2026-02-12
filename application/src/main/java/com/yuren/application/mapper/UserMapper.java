package com.yuren.application.mapper;

import com.yuren.application.command.SignUpCommand;
import com.yuren.application.payload.SignUpPayload;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    SignUpPayload toPayload(SignUpCommand command);
}
