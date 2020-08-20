package com.nokchax.book.springboot.web.dto;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void lombokTest() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto response = new HelloResponseDto(name, amount);

        //then
        assertThat(response.getName()).isEqualTo(name);
        assertThat(response.getAmount()).isEqualTo(amount);
    }
}