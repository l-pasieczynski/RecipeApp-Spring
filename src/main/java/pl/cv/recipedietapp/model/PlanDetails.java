package pl.cv.recipedietapp.model;


import pl.cv.recipedietapp.entity.DayName;
import pl.cv.recipedietapp.entity.Recipe;
import pl.cv.recipedietapp.entity.RecipePlan;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;


public class PlanDetails {

    @OneToMany
    @JoinColumn(name = "dayName_id")
    private List<DayName> dayNameId = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "recipe_id")
    private List<Recipe> recipeId = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "recipe_plan_id")
    private List<RecipePlan> recipePlanId = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "day_name")
    private List<DayName> dayName = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "meal_name")
    private List<RecipePlan> mealName = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "recipe_name")
    private List<Recipe> recipeName = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "recipe_description")
    private List<Recipe> recipeDescription = new ArrayList<>();

    public PlanDetails() {
    }

    public PlanDetails(List<DayName> dayNameId, List<Recipe> recipeId, List<RecipePlan> recipePlanId, List<DayName> dayName, List<RecipePlan> mealName, List<Recipe> recipeName, List<Recipe> recipeDescription) {
        this.dayNameId = dayNameId;
        this.recipeId = recipeId;
        this.recipePlanId = recipePlanId;
        this.dayName = dayName;
        this.mealName = mealName;
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
    }

    public List<DayName> getDayNameId() {
        return dayNameId;
    }

    public PlanDetails setDayNameId(List<DayName> dayNameId) {
        this.dayNameId = dayNameId;
        return this;
    }

    public List<Recipe> getRecipeId() {
        return recipeId;
    }

    public PlanDetails setRecipeId(List<Recipe> recipeId) {
        this.recipeId = recipeId;
        return this;
    }

    public List<RecipePlan> getRecipePlanId() {
        return recipePlanId;
    }

    public PlanDetails setRecipePlanId(List<RecipePlan> recipePlanId) {
        this.recipePlanId = recipePlanId;
        return this;
    }

    public List<DayName> getDayName() {
        return dayName;
    }

    public PlanDetails setDayName(List<DayName> dayName) {
        this.dayName = dayName;
        return this;
    }

    public List<RecipePlan> getMealName() {
        return mealName;
    }

    public PlanDetails setMealName(List<RecipePlan> mealName) {
        this.mealName = mealName;
        return this;
    }

    public List<Recipe> getRecipeName() {
        return recipeName;
    }

    public PlanDetails setRecipeName(List<Recipe> recipeName) {
        this.recipeName = recipeName;
        return this;
    }

    public List<Recipe> getRecipeDescription() {
        return recipeDescription;
    }

    public PlanDetails setRecipeDescription(List<Recipe> recipeDescription) {
        this.recipeDescription = recipeDescription;
        return this;
    }
}
