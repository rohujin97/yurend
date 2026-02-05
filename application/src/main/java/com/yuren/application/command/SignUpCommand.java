package com.yuren.application.command;

import com.yuren.domain.enums.Gender;
import lombok.*;

@Getter
@Builder
@ToString
public class SignUpCommand {
    private String name;
    private Integer age;
    private Gender gender;
    private String id;
    private String password;
}
