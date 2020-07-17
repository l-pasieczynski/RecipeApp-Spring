package pl.cv.recipedietapp.service;

import org.springframework.stereotype.Service;
import pl.cv.recipedietapp.entity.Plan;
import pl.cv.recipedietapp.entity.Recipe;
import pl.cv.recipedietapp.repository.RecipeRepository;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

//    public void deleteRecipe(Long recipeId) {
//        Recipe recipe = findById(recipeId);
//        recipeRepository.delete(recipeId);
//    }
//
//    public void deleteAllUserRecipies(){
//        recipeRepository.deleteAll();
//    }
//
//    public Recipe findByRecipeId(Long recipeId) {
//        return recipeRepository.findById(recipeId);
//    }
//
//    public List<Recipe> findAllUserRecipies(Long userId) {
//        return recipeRepository.findAll(userId);
//    }
//
    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }
}
