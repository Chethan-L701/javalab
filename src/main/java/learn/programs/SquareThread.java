package learn.programs;

public class SquareThread implements Runnable {
    private int num;
    SquareThread(int n) {
        num = n;
    }
    @Override
    public void run() {
        System.out.println("SquareThread: The square of " + num + " is " + (num * num));
    }
}
