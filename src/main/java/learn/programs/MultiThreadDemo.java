package learn.programs;
import java.util.Scanner;
public class MultiThreadDemo {
    public static void execute() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to generate random numbers: ");
        int times = sc.nextInt(); 
        Thread rng = new Thread(new RandomNumberGenaratorThread(times));
        rng.start();
    }
}
