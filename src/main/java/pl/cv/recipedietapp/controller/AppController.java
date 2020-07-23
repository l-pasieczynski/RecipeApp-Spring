package pl.cv.recipedietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class AppController {

    @RequestMapping("/home")
    public String appStart() {
        return "app/home";
    }
}

