package learn.programs;

import java.util.Scanner;

public class ExceptionHandling {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("The division is : " + (a / b));
        }
        // Stacking multiple catch blocks
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException is caught : Occurs when dividing by zero");
            System.out.println("Division by zero is not possible");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException is caught : Occurs when input is not a number");
            System.out.println("Invalid input");
        } catch (Exception e) {
            System.out.println(
                    "Exception is caught : This is the default catch block | it capture all the exceptions,irrespective to the type of exception");
            System.out.println("Something went wrong");
            System.out.println(e);
        } finally {
            System.out.println("This is the finally block");
            System.out.println("This block will be executed always | Runs even if there is an exception(error)");
        }
    }
}
