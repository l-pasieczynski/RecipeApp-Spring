package pl.cv.recipedietapp.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.cv.recipedietapp.entity.User;
import pl.cv.recipedietapp.repository.UserRepository;
import pl.cv.recipedietapp.service.UserEditServiceImpl;

@Controller
@RequestMapping("user")
public class UserController {
    UserRepository userRepository;
    UserEditServiceImpl userEditService;

    public UserController(UserRepository userRepository, UserEditServiceImpl userEditService) {
        this.userRepository = userRepository;
        this.userEditService = userEditService;
    }

    @GetMapping("/edit")
    public String edit(Model m){

        Authentication a = SecurityContextHolder.getContext().getAuthentication();
        String name = a.getName();




        m.addAttribute("user",userRepository.findByUsername(name));


        return "app/user/editForm";
    }
    @PostMapping("/edit")
    public String editUser(@ModelAttribute User user){
        userEditService.saveUser(user);

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        authentication.setAuthenticated(false);

        return "redirect:/" ;

    }




}
