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


/**
 * RunWith 어노테이션은 JUnit 프레임워크가 테스트를 실행할 시(JUnit은 내장된 Runner를 테스트 시 실행하고 됨) 테스트 실행방법을 확장할 때 쓰는 어노테이션 입니다.
 * 쉽게 말해 JUnit 프레임워크가 내장된 Runner를 실행할 때 @Runwith 어노테이션을 통해 SpringRunner.class라는 확장된 클래스를 실행하라고 지시한 것입니다.
 *
 * ref) https://engkimbs.tistory.com/768
 */
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