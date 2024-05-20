package model;

import java.util.ArrayList;
import java.util.List;

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

    // Sample dishes for the savoury category
    public static final List<Dish> SAVOURY_DISHES = new ArrayList<>();

    static {
        // Ingredients for Spaghetti Bolognese dish
        List<String> spaghettiBologneseIngredients = new ArrayList<>();
        spaghettiBologneseIngredients.add("ground beef");
        spaghettiBologneseIngredients.add("tomato sauce");
        spaghettiBologneseIngredients.add("onion");
        spaghettiBologneseIngredients.add("garlic");
        spaghettiBologneseIngredients.add("spaghetti");

        // Ingredients for Halloumi Salad dish
        List<String> halloumiSaladIngredients = new ArrayList<>();
        halloumiSaladIngredients.add("avocado");
        halloumiSaladIngredients.add("halloumi");
        halloumiSaladIngredients.add("mint");
        halloumiSaladIngredients.add("cucumbers");
        halloumiSaladIngredients.add("bell peppers");

        // Add dishes to the list
        SAVOURY_DISHES.add(new Dish("Spaghetti Bolognese", spaghettiBologneseIngredients));
        SAVOURY_DISHES.add(new Dish("Halloumi Salad", halloumiSaladIngredients));
    }

    public static Ingredient[] getSpaghettiBologneseIngredients() {
        List<String> spaghettiBologneseIngredients = new ArrayList<>();
        spaghettiBologneseIngredients.add("ground beef");
        spaghettiBologneseIngredients.add("tomato sauce");
        spaghettiBologneseIngredients.add("onion");
        spaghettiBologneseIngredients.add("garlic");
        spaghettiBologneseIngredients.add("spaghetti");

        Ingredient[] ingredientsArray = new Ingredient[spaghettiBologneseIngredients.size()];
        for (int i = 0; i < spaghettiBologneseIngredients.size(); i++) {
            ingredientsArray[i] = new Ingredient(spaghettiBologneseIngredients.get(i), "Savoury");
        }
        return ingredientsArray;
    }

    public static Ingredient[] getHalloumiSaladIngredients() {
        List<String> halloumiSaladIngredients = new ArrayList<>();
        halloumiSaladIngredients.add("avocado");
        halloumiSaladIngredients.add("halloumi");
        halloumiSaladIngredients.add("mint");
        halloumiSaladIngredients.add("cucumbers");
        halloumiSaladIngredients.add("bell peppers");

        Ingredient[] ingredientsArray = new Ingredient[halloumiSaladIngredients.size()];
        for (int i = 0; i < halloumiSaladIngredients.size(); i++) {
            ingredientsArray[i] = new Ingredient(halloumiSaladIngredients.get(i), "Savoury");
        }
        return ingredientsArray;
    }
}
