package pl.cv.recipedietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.cv.recipedietapp.entity.User;
import pl.cv.recipedietapp.repository.RecipeRepository;
import pl.cv.recipedietapp.service.UserService;

@Controller
@RequestMapping("/")
public class HomeController {
    private final UserService userService;
    private final RecipeRepository recipeRepository;

    public HomeController(UserService userService, RecipeRepository recipeRepository) {
        this.userService = userService;
        this.recipeRepository = recipeRepository;
    }

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("register")
    public String register(Model m) {
        m.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("register")
    public String registerUser(@ModelAttribute("user") @Validated User user,
                               BindingResult errors) {

        if (errors.hasErrors()) {
            return "/register";
        }
        userService.saveUser(user);
        return "redirect:login";
    }


    @GetMapping("about")
    public String about() {
        return "about";
    }

    @GetMapping("recipes")
    public String recipes(Model model) {
        model.addAttribute("recipies", recipeRepository.findAll());
        return "recipes";
    }

    @PostMapping("recipes")
    public String searchedRecipies(@RequestParam String search, Model model) {
        model.addAttribute("recipies", recipeRepository.findRecipeByRecipeName(search));
        return "redirect:recipes";
    }

    @GetMapping("contact")
    public String contact() {
        return "contact";
    }
}
