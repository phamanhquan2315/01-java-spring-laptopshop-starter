package vn.hoidanit.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Controller
// public class UserController1 {

    // MVC
//     @RequestMapping("/")
//     public String getHomePage(){
//         return "hello from controller";
//     }

// }

@RestController
public class UserController {
    
    // Restful API
    @GetMapping("/")
    public String getHomePage(){
        return "hello from controller";
    }

}
