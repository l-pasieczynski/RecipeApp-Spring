package pl.cv.recipedietapp.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import pl.cv.recipedietapp.service.CurrentUser;

@Controller
@SessionAttributes({"userId"})
@RequestMapping("/app")
public class AppController {

    @GetMapping("/home")
    public String appStart(@AuthenticationPrincipal CurrentUser currentUser, Model model) {
        if (currentUser == null) {
            return "/login";
        } else {
            Long id = currentUser.getUser().getId();
            model.addAttribute("userId", id);
            return "app/home";
        }
    }
}


