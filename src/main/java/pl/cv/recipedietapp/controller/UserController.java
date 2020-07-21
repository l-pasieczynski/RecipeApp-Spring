package pl.cv.recipedietapp.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.cv.recipedietapp.entity.User;
import pl.cv.recipedietapp.service.CurrentUser;
import pl.cv.recipedietapp.service.UserService;


@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/create-user")
    @ResponseBody
    public String createUser() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");
        userService.saveUser(user);
        return "admin";
    }
    @GetMapping("/admin")
    @ResponseBody
    public String admin(@AuthenticationPrincipal CurrentUser customUser) {
        User entityUser = customUser.getUser();
        return "dziala";
    }

}