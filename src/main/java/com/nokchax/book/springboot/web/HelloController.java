package com.nokchax.book.springboot.web;

import com.nokchax.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // JSON 을 반환하도록 컨트롤러를 만들어 줌, 메소드에 @ResponseBody 를 선언한 것과 동일
public class HelloController {

    @GetMapping("/hello") //@RequestMapping(method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
