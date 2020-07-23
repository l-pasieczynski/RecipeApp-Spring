package pl.cv.recipedietapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.cv.recipedietapp.entity.Recipe;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {



    @Query(value = "SELECT recipe FROM Recipe recipe WHERE recipe.name = :searchRecipe ORDER BY recipe.id ASC")
    List<Recipe> findRecipeByRecipeName(@Param("searchRecipe") String searchRecipe);




}
