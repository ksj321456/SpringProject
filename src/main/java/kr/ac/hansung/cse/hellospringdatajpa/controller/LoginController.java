package kr.ac.hansung.cse.hellospringdatajpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/loginSuccess")
    public String loginSuccess() {
        return "loginSuccess";  // loginSuccess.html
    }

    @GetMapping("/loginFail")
    public String loginFail() {
        return "loginFail";
    }
}

