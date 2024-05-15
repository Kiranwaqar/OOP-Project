/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author imkir
 */
 import java.util.ArrayList;
import java.util.List;
import model.Ingredient;
   
public class SavouryIngredient extends IngredientCategory {
    @Override
    public List<Ingredient> getAllIngredients() {
        List<Ingredient> savouryIngredients = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            if ("Savoury".equalsIgnoreCase(ingredient.getCategory())) {
                savouryIngredients.add(ingredient);
            }
        }
        return savouryIngredients;
    }

    // Additional methods specific to savoury ingredients

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static final Ingredient[] spaghettiBologneseIngredients = {
    new Ingredient("Ground Beef", "Protein"),
    new Ingredient("Tomato Sauce", "Sauce"),
    new Ingredient("Onion", "Vegetable"),
    new Ingredient("Garlic", "Vegetable"),
    new Ingredient("Spaghetti", "Pasta")
};

public static final Ingredient[] vegetableStirFryIngredients = {
    new Ingredient("Broccoli", "Vegetable"),
    new Ingredient("Carrot", "Vegetable"),
    new Ingredient("Bell Pepper", "Vegetable"),
    new Ingredient("Soy Sauce", "Sauce"),
    new Ingredient("Tofu", "Protein")
};

}


