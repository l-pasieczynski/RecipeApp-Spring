package pl.cv.recipedietapp.service;

import org.springframework.stereotype.Service;
import pl.cv.recipedietapp.EntityNotFoundException;
import pl.cv.recipedietapp.entity.Recipe;
import pl.cv.recipedietapp.repository.RecipeRepository;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe findById(Long id) {
        return recipeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id, Recipe.class.getSimpleName()));
    }

    public void deleteRecipe(Long id) {
        Recipe recipe = findById(id);
        recipeRepository.delete(recipe);
    }

    public List<Recipe> findAll() {
        return recipeRepository.findAll();
    }

    public void create(Recipe recipe) {
        recipeRepository.save(recipe);
    }
}


