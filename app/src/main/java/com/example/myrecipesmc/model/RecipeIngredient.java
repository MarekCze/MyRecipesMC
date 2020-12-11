package com.example.myrecipesmc.model;

public class RecipeIngredient {
    private int recipe_id;
    private Ingredient ingredient;
    private float amount;

    public RecipeIngredient(int recipe_id, Ingredient ingredient, float amount) {
        this.recipe_id = recipe_id;
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
