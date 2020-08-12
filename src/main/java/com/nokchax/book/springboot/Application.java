package com.nokchax.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
    // SpringBootApplication 패키지를 기준으로 아래 패키지를 읽으므로 프로젝트의 최상단에 위치해야 한다.
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
