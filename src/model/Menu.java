package model;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Dish> dishes;

    public Menu() {
        dishes = new ArrayList<>();
    }

    public static Menu generateMenu(Customer customer) {
        Menu menu = new Menu();

        // Sample dishes for each category
        List<Dish> sweetDishes = new ArrayList<>();
        sweetDishes.add(new Dish("Opera Cake", new ArrayList<>()));
        sweetDishes.add(new Dish("Panna Cotta", new ArrayList<>()));

        List<Dish> savoryDishes = new ArrayList<>();
        savoryDishes.add(new Dish("Spaghetti Bolognese", new ArrayList<>()));
        savoryDishes.add(new Dish("halloumi Salad", new ArrayList<>()));

        List<Dish> spicyDishes = new ArrayList<>();
        spicyDishes.add(new Dish("Togarashi Steak", new ArrayList<>()));
        spicyDishes.add(new Dish("Firecracker Chicken", new ArrayList<>()));

        // Add dishes based on customer preferences
        switch (customer.getPreference()) {
            case "sweet":
                menu.dishes.addAll(sweetDishes);
                break;
            case "savory":
                menu.dishes.addAll(savoryDishes);
                break;
            case "spicy":
                menu.dishes.addAll(spicyDishes);
                break;
            default:
                // If preference doesn't match any category, add all dishes
                menu.dishes.addAll(sweetDishes);
                menu.dishes.addAll(savoryDishes);
                menu.dishes.addAll(spicyDishes);
                break;
        }

        return menu;
    }

    public List<Dish> getDishes() {
        return dishes;
    }
}