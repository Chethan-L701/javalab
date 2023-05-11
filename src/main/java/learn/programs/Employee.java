package learn.programs;

import java.util.Scanner;

public class Employee {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of technical staff");
        int numberOfTechnical = sc.nextInt();
        TechnicalStaff[] technicalStaff = new TechnicalStaff[numberOfTechnical];
        System.out.println("Enter the number of contract staff");
        int noOfContrant = sc.nextInt();
        ContractStaff[] contractStaff = new ContractStaff[noOfContrant];
        System.out.println("Enter the number of teaching staff");
        int noOfTeaching = sc.nextInt();
        TeachingStaff[] teachingStaff = new TeachingStaff[noOfTeaching];
        System.out.println("-----------------------------------------------------");
        System.out.println("Enter the details of technical staff");
        for (int i = 0; i < numberOfTechnical; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Enter the details of technical staff " + (i + 1));
            technicalStaff[i] = new TechnicalStaff();
            technicalStaff[i].read();
            System.out.println("-----------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Enter the details of contract staff");
        for (int i = 0; i < noOfContrant; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Enter the details of contract staff " + (i + 1));
            contractStaff[i] = new ContractStaff();
            contractStaff[i].read();
            System.out.println("-----------------------------------------------------");
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("Enter the details of teaching staff");
        for (int i = 0; i < noOfTeaching; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Enter the details of teaching staff " + (i + 1));
            teachingStaff[i] = new TeachingStaff();
            teachingStaff[i].read();
            System.out.println("-----------------------------------------------------");
        }
        System.out.println("The details of all employees are : ");
        for (int i = 0; i < numberOfTechnical; i++) {
            System.out.println("-----------------------------------------------------");
            technicalStaff[i].display();
            System.out.println("-----------------------------------------------------");
        }
        for (int i = 0; i < noOfContrant; i++) {
            System.out.println("-----------------------------------------------------");
            contractStaff[i].display();
            System.out.println("-----------------------------------------------------");
        }
        for (int i = 0; i < noOfTeaching; i++) {
            System.out.println("-----------------------------------------------------");
            teachingStaff[i].display();
            System.out.println("-----------------------------------------------------");
        }
    }
}
