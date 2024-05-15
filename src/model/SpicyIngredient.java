package model;

import java.util.ArrayList;
import java.util.List;



public class SpicyIngredient extends IngredientCategory {
    @Override
    public List<Ingredient> getAllIngredients() {
        List<Ingredient> spicyIngredients = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            if ("Spicy".equalsIgnoreCase(ingredient.getCategory())) {
                spicyIngredients.add(ingredient);
            }
        }
        return spicyIngredients;
    }

    // Additional methods specific to sweet ingredients

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 public static final Ingredient[] chickenCurryIngredients = {
        new Ingredient("Chicken", "Protein"),
        new Ingredient("Onion", "Vegetable"),
        new Ingredient("Chili Powder", "Spice")
    };

    public static final Ingredient[] tofuStirFryIngredients = {
        new Ingredient("Tofu", "Protein"),
        new Ingredient("Bell Pepper", "Vegetable"),
        new Ingredient("Soy Sauce", "Sauce")
    };   

    

  
       
       
}
