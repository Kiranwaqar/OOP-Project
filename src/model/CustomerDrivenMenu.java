package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CustomerDrivenMenu implements PreferenceProvider {
    private final Scanner scanner;
    private List<Dish> selectedCategoryDishes;

    public CustomerDrivenMenu() {
        scanner = new Scanner(System.in);
        selectedCategoryDishes = new ArrayList<>();
    }

    @Override
    public void askForPreferences() {
        System.out.println("Welcome to our restaurant!");
        System.out.println("What type of food do you prefer?");
        System.out.println("1. Savoury");
        System.out.println("2. Spicy");
        System.out.println("3. Sweet");

        int preferenceChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (preferenceChoice) {
            case 1 -> selectedCategoryDishes = SavouryIngredient.SAVOURY_DISHES;
            case 2 -> selectedCategoryDishes = SpicyIngredient.SPICY_DISHES;
            case 3 -> selectedCategoryDishes = SweetIngredient.SWEET_DISHES;
            default -> {
                System.out.println("Invalid choice!");
                return;
            }
        }

        handleAllergies();
    }

    private void handleAllergies() {
        System.out.println("Do you have any allergies in this category? (yes/no)");
        String allergyInput = scanner.nextLine().toLowerCase();

        if (allergyInput.equals("yes")) {
            System.out.println("Please enter your allergies separated by comma:");
            String allergiesInput = scanner.nextLine().toLowerCase();
            List<String> allergies = Arrays.asList(allergiesInput.split("\\s*,\\s*"));

            List<Dish> suitableDishes = findSuitableDishes(allergies);

            if (suitableDishes.size() == 1) {
                System.out.println("You can try the dish: " + suitableDishes.get(0).getName());
            } else if (suitableDishes.isEmpty()) {
                System.out.println("Sorry, there are no suitable dishes for you in this category.");
            } else {
                System.out.println("Based on your allergies, the most suitable dish for you is: " + suitableDishes.get(0).getName());
            }
        } else if (allergyInput.equals("no")) {
            displayPreferredDish();
        } else {
            System.out.println("Invalid input! Please enter 'yes' or 'no'.");
            handleAllergies(); // Recursive call to handle allergies again
        }
    }

    private List<Dish> findSuitableDishes(List<String> allergies) {
        List<Dish> suitableDishes = new ArrayList<>();
        for (Dish dish : selectedCategoryDishes) {
            if (!dishContainsAllergies(dish, allergies)) {
                suitableDishes.add(dish);
            }
        }
        return suitableDishes;
    }

    private boolean dishContainsAllergies(Dish dish, List<String> allergies) {
        for (String allergy : allergies) {
            if (dish.getIngredients().contains(allergy)) {
                return true;
            }
        }
        return false;
    }

    private void displayPreferredDish() {
        List<String> ingredientsList = new ArrayList<>();
        for (Dish dish : selectedCategoryDishes) {
            ingredientsList.addAll(dish.getIngredients());
        }

        System.out.println("Here are the available ingredients in this category:");
        ingredientsList.forEach(ingredient -> System.out.println("- " + ingredient));

        System.out.println("Which of the following ingredients do you like the most?");
        String preferredIngredient = scanner.nextLine().toLowerCase();

        List<Dish> suitableDishes = new ArrayList<>();
        for (Dish dish : selectedCategoryDishes) {
            if (dish.getIngredients().contains(preferredIngredient)) {
                suitableDishes.add(dish);
            }
        }

        if (!suitableDishes.isEmpty()) {
            System.out.println("Based on your preference, the most suitable dish for you is: " + suitableDishes.get(0).getName());
        } else {
            System.out.println("Sorry, there are no dishes containing your preferred ingredient in this category.");
        }
    }

    // Close the scanner when it's no longer needed
    public void closeScanner() {
        scanner.close();
    }
}