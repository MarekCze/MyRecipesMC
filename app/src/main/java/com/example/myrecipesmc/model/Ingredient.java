package com.example.myrecipesmc.model;

public class Ingredient {
    private int ingredient_id;
    private String name;

    public Ingredient(int ingredient_id, String name) {
        this.ingredient_id = ingredient_id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIngredient_id() {
        return ingredient_id;
    }

    public void setIngredient_id(int ingredient_id) {
        this.ingredient_id = ingredient_id;
    }
}
