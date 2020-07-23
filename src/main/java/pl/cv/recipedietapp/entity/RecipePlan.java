package pl.cv.recipedietapp.entity;

import javax.persistence.*;

@Entity
public class RecipePlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipeId;
    @Column(nullable = false, length = 100)
    private String mealName;
    @ManyToOne
    @JoinColumn(name = "display_order")
    private DayName displayOrder;
    @ManyToOne
    @JoinColumn(name = "dayName_id")
    private DayName dayNameId;
    @ManyToOne
    @JoinColumn(name = "plan_id")
    private Plan planId;

//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns = @JoinColumn(name = "role_id"))

    public RecipePlan() {
    }

    public long getId() {
        return id;
    }

    public RecipePlan setId(long id) {
        this.id = id;
        return this;
    }

    public Recipe getRecipeId() {
        return recipeId;
    }

    public RecipePlan setRecipeId(Recipe recipeId) {
        this.recipeId = recipeId;
        return this;
    }

    public String getMealName() {
        return mealName;
    }

    public RecipePlan setMealName(String mealName) {
        this.mealName = mealName;
        return this;
    }

    public DayName getDisplayOrder() {
        return displayOrder;
    }

    public RecipePlan setDisplayOrder(DayName displayOrder) {
        this.displayOrder = displayOrder;
        return this;
    }

    public DayName getDayNameId() {
        return dayNameId;
    }

    public RecipePlan setDayNameId(DayName dayNameId) {
        this.dayNameId = dayNameId;
        return this;
    }

    public Plan getPlanId() {
        return planId;
    }

    public RecipePlan setPlanId(Plan planId) {
        this.planId = planId;
        return this;
    }
}
