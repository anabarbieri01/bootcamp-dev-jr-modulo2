package com.projeto.product_backend.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //anotação para indicar que essa classe corresponde a algum end-point
public class HelloController {
    
    @GetMapping("hello")
    public String getHello(){
        return "Hello Spring Boot";
    }
}
