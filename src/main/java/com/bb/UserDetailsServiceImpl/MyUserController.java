package com.bb.UserDetailsServiceImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyUserController {

    @GetMapping("/demo")
    public String greet(){
        return "Hello World!!";
    }

    @GetMapping("/demo2")
    public String greet2(){
        return "Hello World2!!";
    }

    @GetMapping("/testcode")
    public String testCode(){
        return "Testing the code....";
    }

    @GetMapping("/developcode")
    public String developCode(){
        return "Developing the code....";
    }

    @GetMapping("/accessserver")
    public String accessServer(){
        return "Accessing the server....";
    }

    @PostMapping("/home")
    public String home(){
        return "Welcome to the home page....";
    }

    @GetMapping("/home/all")
    public String homeAll(){
        return "Welcome to the home page all....";
    }

}
