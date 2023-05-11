package learn.programs;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String usn;
    private String branch;
    private int semester;
    Scanner sc = new Scanner(System.in);

    public void read() {
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter age");
        age = sc.nextInt();
        System.out.println("Enter usn");
        usn = sc.next();
        System.out.println("Enter branch");
        branch = sc.next();
        System.out.println("Enter semester");
        semester = sc.nextInt();
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("USN : " + usn);
        System.out.println("Branch : " + branch);
        System.out.println("Semester : " + semester);
    }
}
