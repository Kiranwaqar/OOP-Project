package model;

import java.util.ArrayList;
import java.util.Calendar;
//import java.util.Date;
import java.util.List;

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
        Calendar today = Calendar.getInstance();
        today.add(Calendar.DAY_OF_MONTH, 14); // Adding 14 days to today's date

        for (Ingredient ingredient : ingredients) {
            Calendar expiryDate = Calendar.getInstance();
            expiryDate.setTime(ingredient.getExpiryDate());
            
            if (expiryDate.before(today)) {
                System.out.println("Alert: Ingredient " + ingredient.getName()
                        + " will expire in two weeks.");
            }
        }
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}