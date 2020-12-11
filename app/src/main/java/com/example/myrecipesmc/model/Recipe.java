package com.example.myrecipesmc.model;

import java.util.List;

public class Recipe {
    private int recipe_id;
    private String name;
    private String description;
    private String category;
    private int prep_time;
    private int cook_time;
    private String difficulty;
    private int serving;
    private List<RecipeIngredient> recipeIngredients;
    private List<RecipeStep> recipeSteps;

    public Recipe(){}

    public Recipe(int recipe_id, String name, String description, String category, int prep_time, int cook_time, String difficulty, int serving, List<RecipeIngredient> recipeIngredients, List<RecipeStep> recipeSteps){
        this.recipe_id = recipe_id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.prep_time = prep_time;
        this.cook_time = cook_time;
        this.difficulty = difficulty;
        this.serving = serving;
        this.recipeIngredients = recipeIngredients;
        this.recipeSteps = recipeSteps;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrep_time() {
        return prep_time;
    }

    public void setPrep_time(int prep_time) {
        this.prep_time = prep_time;
    }

    public int getCook_time() {
        return cook_time;
    }

    public void setCook_time(int cook_time) {
        this.cook_time = cook_time;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public List<RecipeIngredient> getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(List<RecipeIngredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public List<RecipeStep> getRecipeSteps() {
        return recipeSteps;
    }

    public void setRecipeSteps(List<RecipeStep> recipeSteps) {
        this.recipeSteps = recipeSteps;
    }
}
