package com.yuren.infrastructure.mapper;

import com.yuren.application.payload.SignUpPayload;
import com.yuren.infrastructure.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserEntity toEntity(SignUpPayload payload);
}
