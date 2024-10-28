package week4;

import java.util.Scanner;

public class Thing {
    private String name;
    private int weight;

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the first thing: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter the weight of the first thing: ");
        int weight1 = Integer.parseInt(scanner.nextLine());

        Thing firstThing = new Thing(name1, weight1);

        System.out.print("Enter the name of the second thing: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter the weight of the second thing: ");
        int weight2 = Integer.parseInt(scanner.nextLine());

        Thing secondThing = new Thing(name2, weight2);

        System.out.println("First Thing: " + firstThing);
        System.out.println("Second Thing: " + secondThing);

        scanner.close();
    }
}
