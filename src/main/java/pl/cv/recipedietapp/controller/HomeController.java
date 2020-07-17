package pl.cv.recipedietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.cv.recipedietapp.repository.RecipeRepository;

@Controller
@RequestMapping("/")
public class HomeController {
    private final RecipeRepository recipeRepository;

    public HomeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping
    public String home() {
        return "home";
    }

    @GetMapping("register")
    public String register() {
        return "register";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @GetMapping("about")
    public String about() {
        return "about";
    }

    @GetMapping("recipes")
    public String recipes(Model model){
        model.addAttribute("recipies", recipeRepository.findAll());
        return "recipes";
    }

    @GetMapping("contact")
    public String contact() {
        return "contact";
    }
}
