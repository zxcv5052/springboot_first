package com.kyeong_spring.web.dto;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloResponseDtoTest {

    @Test
    public void 룸북_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        Assertions.assertThat(dto.getName()).isEqualTo(name);
        Assertions.assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
