package week6;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) { 
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

    
    public static void main(String[] args) {
        Menu menu = new Menu();
        
        menu.addMeal("Hamburger");
        menu.addMeal("Fish'n'Chips");
        menu.addMeal("Sauerkraut");
        menu.addMeal("Sauerkraut");

        System.out.println("Menu:");
        menu.printMeals();

        menu.clearMenu();
        System.out.println("\nMenu cleared. Current menu:");
        menu.printMeals();
    }
}

