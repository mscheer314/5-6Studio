package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem chickenWings = new MenuItem("Chicken wings",
                9.99,
                "Spicy tasty wings with an even spicier sauce.",
                Category.APPETIZER,
                true);
        MenuItem pizza = new MenuItem("PIZZA!!!!",
                12.99,
                "The best of the best pizza.",
                Category.MAIN_COURSE,
                false);

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(chickenWings);
        menuItems.add(pizza);

        Menu menu = new Menu("Spring Menu", LocalDate.now(), menuItems);

        System.out.println(menu);
    }
}
