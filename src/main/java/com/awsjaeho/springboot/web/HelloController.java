package com.awsjaeho.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
    RestController는 컨트롤러를 json 반환하는 컨트롤러로 만들어준다
    예전에는 ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해준다.
*/
@RestController
public class HelloController {
    /*
        http method인 get의 요청을 받을 수 있는 api를 만들어 준다
    */
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
