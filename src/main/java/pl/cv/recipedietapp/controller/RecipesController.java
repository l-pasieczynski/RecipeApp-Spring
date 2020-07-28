package pl.cv.recipedietapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.cv.recipedietapp.entity.Recipe;
import pl.cv.recipedietapp.service.RecipeService;

@Controller
@RequestMapping("app")
public class RecipesController {
    private final RecipeService recipeService;

    public RecipesController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipes")
    public String recipes(Model m) {
        m.addAttribute("recipes", recipeService.findAll());
        return "app/recipe/recipes";
    }

    @GetMapping("/recipes/add")
    public String addRecipe(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "app/recipe/recipeForm";
    }

    @PostMapping("recipes/add")
    public String addRecipePost(@ModelAttribute("recipe") Recipe recipe) {
        recipeService.create(recipe);
        return "redirect:../recipes";
    }

    @GetMapping("/recipes/delete/{id}")
    public String delete(Model model) {
        String decision = "";
        model.addAttribute("decision", decision);
        return "app/recipe/recipeDelete";
    }

    @PostMapping("/recipes/delete/{id}")
    public String deletePost(@PathVariable Long id, @ModelAttribute("decision") String decision) {
        if (decision.equals("OK")) {
            recipeService.deleteRecipe(id);
        }
        return "redirect:../";
    }

    @GetMapping("/recipes/details/{id}")
    public String recipeDetails(@PathVariable("id") Long id, Model model) {
        Recipe recipe = recipeService.findById(id);
        model.addAttribute("recipe", recipe);
        return "/app/recipe/recipeDetails";
    }

    @GetMapping("recipes/edit/{id}")
    public String editRecipe(Model model, @PathVariable Long id) {
        Recipe recipe = recipeService.findById(id);
        model.addAttribute("recipe", recipe);
        return "app/recipe/recipeForm";
    }

    @PostMapping("recipes/edit/{id}")
    public String updateRecipe(@ModelAttribute("recipe") Recipe recipe) {
        recipeService.create(recipe);
        return "redirect:../";
    }

}
