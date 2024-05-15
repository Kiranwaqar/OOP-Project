/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
import model.Ingredient;
/**
 *
 * @author imkir
 */



public class SweetIngredient extends IngredientCategory {
    @Override
    public List<Ingredient> getAllIngredients() {
        List<Ingredient> sweetIngredients = new ArrayList<>();
        for (Ingredient ingredient : ingredients) {
            if ("Sweet".equalsIgnoreCase(ingredient.getCategory())) {
                sweetIngredients.add(ingredient);
            }
        }
        return sweetIngredients;
    }

    // Additional methods specific to sweet ingredients

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public static final Ingredient[] chocolateCakeIngredients = {
    new Ingredient("Flour", "Baking"),
    new Ingredient("Sugar", "Sweetener"),
    new Ingredient("Cocoa Powder", "Flavoring"),
    new Ingredient("Butter", "Fat"),
    new Ingredient("Eggs", "Dairy")
};

public static final Ingredient[] fruitSaladIngredients = {
    new Ingredient("Apple", "Fruit"),
    new Ingredient("Banana", "Fruit"),
    new Ingredient("Orange", "Fruit"),
    new Ingredient("Strawberry", "Fruit"),
    new Ingredient("Honey", "Sweetener")
};

 
}
    

