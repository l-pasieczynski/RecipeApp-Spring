package pl.cv.recipedietapp.model;

import pl.cv.recipedietapp.entity.DayName;
import pl.cv.recipedietapp.entity.Recipe;
import pl.cv.recipedietapp.entity.RecipePlan;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class LastPlan {

    @OneToMany
    @JoinColumn(name = "day_name")
    private List<DayName> dayNames = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "meal_name")
    private List<RecipePlan> mealName = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "recipe_name")
    private List<Recipe> recipeName = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "recipe_description")
    private List<Recipe> recipeDescription = new ArrayList<>();

    public LastPlan() {
    }

    public LastPlan(List<DayName> dayNames, List<RecipePlan> mealName, List<Recipe> recipeName, List<Recipe> recipeDescription) {
        this.dayNames = dayNames;
        this.mealName = mealName;
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
    }

    public List<DayName> getDayNames() {
        return dayNames;
    }

    public LastPlan setDayNames(List<DayName> dayNames) {
        this.dayNames = dayNames;
        return this;
    }

    public List<RecipePlan> getMealName() {
        return mealName;
    }

    public LastPlan setMealName(List<RecipePlan> mealName) {
        this.mealName = mealName;
        return this;
    }

    public List<Recipe> getRecipeName() {
        return recipeName;
    }

    public LastPlan setRecipeName(List<Recipe> recipeName) {
        this.recipeName = recipeName;
        return this;
    }

    public List<Recipe> getRecipeDescription() {
        return recipeDescription;
    }

    public LastPlan setRecipeDescription(List<Recipe> recipeDescription) {
        this.recipeDescription = recipeDescription;
        return this;
    }
}
