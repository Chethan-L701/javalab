package learn.programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}
