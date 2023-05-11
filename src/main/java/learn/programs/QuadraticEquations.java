package learn.programs;

import java.util.Scanner;

public class QuadraticEquations {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("It is not a quadratic equation");
            sc.close();
            return;
        }
        if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is " + root);
        } else if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The root1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("The root2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
