package pl.cv.recipedietapp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import pl.cv.recipedietapp.entity.User;
import pl.cv.recipedietapp.service.UserService;

@Controller
@SessionAttributes({"userId"})
public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public String login(Model model) {

//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        String name = auth.getName();
//        UserDetails userDetails = (UserDetails) auth.getPrincipal();
//
//        User user = userService.findByUserName(name);
//        Long userId = user.getId();
//        model.addAttribute("userId", userId);
//        request.getSession().setAttribute("userId", user.getId());

        return "login";
    }


}
