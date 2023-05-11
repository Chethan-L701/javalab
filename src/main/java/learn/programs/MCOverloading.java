package learn.programs;

import java.util.Scanner;

public class MCOverloading {
    MCOverloading() {
        System.out.println("This is the default constructor");
    }

    MCOverloading(int a) {
        System.out.println("This is the parameterized constructor");
        System.out.println("The value of a is : " + a);
    }

    MCOverloading(String s) {
        System.out.println("This is the parameterized constructor");
        System.out.println("The  text is : " + s);
    }

    static void function() {
        System.out.println("This function does not take any parameter");
    }

    static void function(int a, int b) {
        System.out.println("This function takes two parameters and adds them");
        System.out.println("The sum is : " + (a + b));
    }

    public static void execute() {
        Scanner sc = new Scanner(System.in);
        MCOverloading obj = new MCOverloading();
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        MCOverloading obj1 = new MCOverloading(a);
        System.out.println("Enter a string : ");
        String s = sc.next();
        MCOverloading obj2 = new MCOverloading(s);
        function();
        System.out.println("Enter two numbers : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        function(x, y);
    }
}
