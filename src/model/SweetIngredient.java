package model;
import java.util.ArrayList;
import java.util.List;

public class SweetIngredient extends IngredientCategory {

    public static List<String> getIngredients() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

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

    // Sample dishes for the sweet category
    public static final List<Dish> SWEET_DISHES = new ArrayList<>();

    static {
        // Ingredients for Chocolate Cake dish
        List<String> OperaCakeIngredients = new ArrayList<>();
        OperaCakeIngredients.add("Flour");
        OperaCakeIngredients.add("Sugar");
        OperaCakeIngredients.add("Cocoa Powder");
        OperaCakeIngredients.add("Butter");
        OperaCakeIngredients.add("Eggs");
        OperaCakeIngredients.add("Almonds");
        OperaCakeIngredients.add("Baking Powder");

        // Ingredients for Fruit Salad dish
        List<String> PannaCottaIngredients = new ArrayList<>();
        PannaCottaIngredients.add("Heavy Cream");
        PannaCottaIngredients.add("Skimmed Milk");
        PannaCottaIngredients.add("Vanilla Extract");
        PannaCottaIngredients.add("Strawberry");
        PannaCottaIngredients.add("Gelatin");

        // Add dishes to the list
        SWEET_DISHES.add(new Dish("Opera Cake", OperaCakeIngredients));
        SWEET_DISHES.add(new Dish("Panna Cotta", PannaCottaIngredients));
    }

    public static Ingredient[] getOperaCakeIngredients() {
        List<String> OperaCakeIngredients = new ArrayList<>();
        OperaCakeIngredients.add("Flour");
        OperaCakeIngredients.add("Sugar");
        OperaCakeIngredients.add("Cocoa Powder");
        OperaCakeIngredients.add("Butter");
        OperaCakeIngredients.add("Eggs");
        OperaCakeIngredients.add("Almonds");
        OperaCakeIngredients.add("Baking Powder");

        Ingredient[] ingredientsArray = new Ingredient[OperaCakeIngredients.size()];
        for (int i = 0; i < OperaCakeIngredients.size(); i++) {
            ingredientsArray[i] = new Ingredient(OperaCakeIngredients.get(i), "Sweet");
        }
        return ingredientsArray;
    }

    public static Ingredient[] getPannaCottaIngredients() {
        List<String> PannaCottaIngredients = new ArrayList<>();
        PannaCottaIngredients.add("Heavy Cream");
        PannaCottaIngredients.add("Skimmed Milk");
        PannaCottaIngredients.add("Vanilla Extract");
        PannaCottaIngredients.add("Strawberry");
        PannaCottaIngredients.add("Gelatin");

        Ingredient[] ingredientsArray = new Ingredient[PannaCottaIngredients.size()];
        for (int i = 0; i < PannaCottaIngredients.size(); i++) {
            ingredientsArray[i] = new Ingredient(PannaCottaIngredients.get(i), "Sweet");
        }
        return ingredientsArray;
    }
}
