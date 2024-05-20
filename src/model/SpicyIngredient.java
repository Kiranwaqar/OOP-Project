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

    // Sample dishes for the spicy category
    public static final List<Dish> SPICY_DISHES = new ArrayList<>();

    static {
        // Ingredients for Firecracker Chicken dish
        List<String> firecrackerChickenIngredients = new ArrayList<>();
        firecrackerChickenIngredients.add("Chicken");
        firecrackerChickenIngredients.add("Onion");
        firecrackerChickenIngredients.add("Chili Powder");
        firecrackerChickenIngredients.add("Cornstarch");
        firecrackerChickenIngredients.add("Black Pepper");
        firecrackerChickenIngredients.add("Garlic Powder");

        // Ingredients for Togarashi Steak dish
        List<String> togarashiSteakIngredients = new ArrayList<>();
        togarashiSteakIngredients.add("Cream Cheese");
        togarashiSteakIngredients.add("Honey");
        togarashiSteakIngredients.add("Butter");
        togarashiSteakIngredients.add("Sirloin Steak");
        togarashiSteakIngredients.add("Togarashi Powder");
        togarashiSteakIngredients.add("Soy Sauce");

        // Add dishes to the list
        SPICY_DISHES.add(new Dish("Firecracker Chicken", firecrackerChickenIngredients));
        SPICY_DISHES.add(new Dish("Togarashi Steak", togarashiSteakIngredients));
    }

    public static Ingredient[] getFirecrackerChickenIngredients() {
        List<String> firecrackerChickenIngredients = new ArrayList<>();
        firecrackerChickenIngredients.add("Chicken");
        firecrackerChickenIngredients.add("Onion");
        firecrackerChickenIngredients.add("Chili Powder");
        firecrackerChickenIngredients.add("Cornstarch");
        firecrackerChickenIngredients.add("Black Pepper");
        firecrackerChickenIngredients.add("Garlic Powder");

        Ingredient[] ingredientsArray = new Ingredient[firecrackerChickenIngredients.size()];
        for (int i = 0; i < firecrackerChickenIngredients.size(); i++) {
            ingredientsArray[i] = new Ingredient(firecrackerChickenIngredients.get(i), "Spicy");
        }
        return ingredientsArray;
    }

    public static Ingredient[] getTogarashiSteakIngredients() {
        List<String> togarashiSteakIngredients = new ArrayList<>();
        togarashiSteakIngredients.add("Cream Cheese");
        togarashiSteakIngredients.add("Honey");
        togarashiSteakIngredients.add("Butter");
        togarashiSteakIngredients.add("Sirloin Steak");
        togarashiSteakIngredients.add("Togarashi Powder");
        togarashiSteakIngredients.add("Soy Sauce");

        Ingredient[] ingredientsArray = new Ingredient[togarashiSteakIngredients.size()];
        for (int i = 0; i < togarashiSteakIngredients.size(); i++) {
            ingredientsArray[i] = new Ingredient(togarashiSteakIngredients.get(i), "Spicy");
        }
        return ingredientsArray;
    }
}
