package learn.programs;

import java.util.Scanner;

public class Staff {
    protected String name;
    protected String staffId;
    protected long phoneNumber;
    protected double salary;
    protected Scanner sc = new Scanner(System.in);

    public void read() {
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter staff id");
        staffId = sc.next();
        System.out.println("Enter phone number");
        phoneNumber = sc.nextLong();
        System.out.println("Enter salary");
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Salary : " + salary);
    }
}
