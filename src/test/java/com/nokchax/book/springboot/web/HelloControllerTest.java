package com.nokchax.book.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


//todo @RunWith 와 SpringRunner 에 대하여
@RunWith(SpringRunner.class)
@WebMvcTest // @Controller, @ControllerAdvice 를 사용할 수 있음 / @Service, @Repository, @Component 는 사용 못한다.
// 그러면 @ControllerAdvice 는..?
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void returnHello() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello)); // 본문 내용을 검증
    }

}