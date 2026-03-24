package ExceptionAssignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            if (age < 0 || age > 100) {
                throw new InvalidAge("Invalid age: Age cannot be negative or above 100");
            }
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        }

    }
}
