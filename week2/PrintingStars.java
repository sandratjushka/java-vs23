package week2;

import java.util.Scanner;

public class PrintingStars {

    private static void printStars(int amount) {
        int score = 0; 
        while (score < amount) {
            System.out.println("*");
            score++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(2);
        
        System.out.print("Enter the number of stars to print: ");
        int amount = scanner.nextInt();

        printStars(amount);

        scanner.close();
    }
}

