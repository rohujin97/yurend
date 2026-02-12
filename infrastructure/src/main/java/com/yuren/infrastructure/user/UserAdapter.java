package com.yuren.infrastructure.user;

import com.yuren.application.payload.SignUpPayload;
import com.yuren.application.port.SignUpPort;
import com.yuren.infrastructure.entity.UserEntity;
import com.yuren.infrastructure.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class UserAdapter implements SignUpPort {

    private final UserRepository repository;

    private static final UserMapper MAPPER = UserMapper.INSTANCE;

    @Override
    public void save(SignUpPayload payload) {
        UserEntity entity = MAPPER.toEntity(payload);
        entity = repository.save(entity);
        log.info("entity: {}", entity);
    }
}
