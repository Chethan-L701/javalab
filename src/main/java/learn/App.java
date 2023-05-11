package learn;

import learn.programs.*;
import learn.programs.GUICalculator.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Quadratic Equation");
            System.out.println("2. Student Details");
            System.out.println("3. Prime Number");
            System.out.println("4. Simple Calculator");
            System.out.println("5. Employee Details");
            System.out.println("6. Method And Constructor Overloading");
            System.out.println("7. Convertor");
            System.out.println("8. Resume(interface)");
            System.out.println("9. Multithreading");
            System.out.println("10. ArrayList Operation");
            System.out.println("11. Exception Handling");
            System.out.println("12. File Handling");
            System.out.println("13. GUI Calculator(using swing)");
            System.out.println("14. Exit");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1:
                        QuadraticEquations.execute();
                        break;
                    case 2:
                        StudentDetails.execute();
                        break;
                    case 3:
                        PrimeNumber.execute();
                        break;
                    case 4:
                        SimpleCalculator.execute();
                        break;
                    case 5:
                        Employee.execute();
                        break;
                    case 6:
                        MCOverloading.execute();
                        break;
                    case 7:
                        ConvertorInter.execute();
                        break;
                    case 8:
                        ResumeDetail.execute();
                        break;
                    case 9:
                        MultiThreadDemo.execute();
                        break;
                    case 10:
                        ArrayListOperations.execute();
                        break;
                    case 11:
                        ExceptionHandling.execute();
                        break;
                    case 12:
                        FileHandling.execute();
                        break;
                    case 13:
                        new CalculatorUI().execute();
                        break;
                    case 14:
                        sc.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
