package com.kyeong_spring.prc.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    public final String name;
    public final int amount;
}
