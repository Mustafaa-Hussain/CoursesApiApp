package com.example.CoursesApiApp.Home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    public String sayHi(){
        return "com/example/CoursesApiApp/Home";
    }
}
