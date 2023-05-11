package learn.programs;
import java.util.Scanner;
import java.io.*;

public class FileHandling {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name : (Enter the full path if file is not in this directory)");
        String fileName = sc.next();
        try {
            File file = new File(fileName);
            if (file.exists()) {
                System.out.println("File exists");
                System.out.println("File size : " + file.length());
                System.out.println("File name : " + file.getName());
                System.out.println("File path : " + file.getAbsolutePath());
                System.out.println(file.canRead()?"File can be read" : "File cannot be read");
                System.out.println(file.canWrite()?"File can be written" : "File cannot be written");
                System.out.println(file.canExecute()?"File can be executed" : "File cannot be executed");
                String type = "".concat(file.getName().substring(file.getName().lastIndexOf(".")));
                System.out.println("File type : " + type);
            } else {
                System.out.println("File does not exist");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
