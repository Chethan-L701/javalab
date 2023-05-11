package learn.programs;

import java.util.Scanner;

public class ResumeDetail {
    public static void execute() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the teacher resume details : ");
        System.out.println("Enter the teacher name : ");
        String name = sc.nextLine();
        System.out.println("Enter the teacher qualification : ");
        String qualification = sc.nextLine();
        System.out.println("Enter the teacher experience : ");
        String experience = sc.nextLine();
        System.out.println("Enter the teacher achievements : ");
        String achievements = sc.nextLine();
        TeacherResume teacherResume = new TeacherResume(name, qualification, experience, achievements);

        System.out.println("Enter the student resume details : ");
        System.out.println("Enter the student name : ");
        String name1 = sc.nextLine();
        System.out.println("Enter the student result : ");
        String result = sc.nextLine();
        System.out.println("Enter the student discipline : ");
        String discipline = sc.nextLine();
        StudentResume studentResume = new StudentResume(name1, result, discipline);

        teacherResume.biodata();
        studentResume.biodata();

    }
}
