package learn.programs;

import java.util.Scanner;

public class StudentDetails {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students :");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of student " + (i + 1));
            students[i] = new Student();
            students[i].read();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("The details of student " + (i + 1));
            students[i].display();
        }
    }
}
