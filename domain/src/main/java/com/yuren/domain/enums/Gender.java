package com.yuren.domain.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Gender {
    FEMALE("female"),
    MALE("male");

    private final String value;

    Gender(String value) {
        this.value = value;
    }

    @JsonCreator
    public static Gender from(String value) {
        return Arrays.stream(values())
                .filter(g -> g.value.equalsIgnoreCase(value))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("Invalid gender: " + value));
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
