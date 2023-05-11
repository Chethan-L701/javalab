package learn.programs;

import java.util.Scanner;

public class SimpleCalculator {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator (+, -, *, /)");
        String operator = sc.next();
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                    break;
                }
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
