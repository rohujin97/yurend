package com.yuren.application.payload;

import com.yuren.domain.enums.Gender;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SignUpPayload {
    private String name;
    private Integer age;
    private Gender gender;
    private String id;
    private String password;
}
