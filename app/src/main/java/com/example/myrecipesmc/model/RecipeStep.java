package com.example.myrecipesmc.model;

public class RecipeStep {
    private int recipe_id;
    private int step_number;
    private String instructions;

    public RecipeStep(int recipe_id, int step_number, String instructions) {
        this.recipe_id = recipe_id;
        this.step_number = step_number;
        this.instructions = instructions;
    }

    public int getRecipe_id() {
        return recipe_id;
    }

    public void setRecipe_id(int recipe_id) {
        this.recipe_id = recipe_id;
    }

    public int getStep_number() {
        return step_number;
    }

    public void setStep_number(int step_number) {
        this.step_number = step_number;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
