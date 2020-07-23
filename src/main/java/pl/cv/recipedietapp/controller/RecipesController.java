package pl.cv.recipedietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.cv.recipedietapp.repository.RecipeRepository;

@Controller
@RequestMapping("app")
public class RecipesController {
    RecipeRepository recipeRepository;

    public RecipesController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/recipes")
    public String recipes(Model m){
        m.addAttribute("recipes",recipeRepository.findAll());
        return "app/recipes";
    }

}
