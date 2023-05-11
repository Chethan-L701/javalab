package learn.programs;

import java.util.Random;

public class RandomNumberGenaratorThread implements Runnable {
    private int times;
    private Random random = new Random();

    RandomNumberGenaratorThread(int t) {
        times = t;
    }

    @Override
    public void run() {
        Thread square;
        Thread cube;
        for (int i = 0; i < times; i++) {
            int num = random.nextInt(100);
            System.out.println("RandomNumberGenaratorThread:The random number is " + num);
            square = new Thread(new SquareThread(num));
            cube = new Thread(new CubeThread(num));
            square.start();
            cube.start();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException ignored){}
            System.out.println("-----------------------------------------------");
        }
    }

}
