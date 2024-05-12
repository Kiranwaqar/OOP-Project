/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;
/**
 *
 * @author imkir
 */
public class FoodInventorySystem {
    private List<Ingredient> ingredients = new ArrayList<>();

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }

    public void displayIngredients() {
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }

    public void removeIngredient(String name) {
        ingredients.removeIf(ingredient -> ingredient.getName().equals(name));
    }

    public void checkExpiration() {
        Date today = new Date();
        for (Ingredient ingredient : ingredients) {
            if (ingredient.getExpiryDate().before(today)) {
                System.out.println("Ingredient expired: " + ingredient.getName());
            }
        }
    }


}
