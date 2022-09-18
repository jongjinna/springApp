package com.example.website;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/main")
    @ResponseBody
    public String index() {
        return "<h1>Hi, I`m Jongjin.</h1></br> <h2>Nice to Meet you!</h2>";
    }
}