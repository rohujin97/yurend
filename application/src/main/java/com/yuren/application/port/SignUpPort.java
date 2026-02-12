package com.yuren.application.port;

import com.yuren.application.payload.SignUpPayload;

public interface SignUpPort {
    void save(SignUpPayload payload);
}
