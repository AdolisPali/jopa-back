package com.example.winter.cars;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @RequestMapping("/hello")
    public String helloProbe() {
        return "Hello " + LocalDateTime.now();
    }
}
