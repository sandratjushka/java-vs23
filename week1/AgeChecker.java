import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age;

        while (true) {
            System.out.print("Please enter your age: ");
            age = input.nextInt();

            if (age >= 0 && age <= 120) {
                System.out.println("OK!");
                break;
            } else {
                System.out.println("Impossible!");
            }
        }

        input.close();
    }
}
