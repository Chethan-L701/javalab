package learn.programs;

class CubeThread implements Runnable {
    private int num;
    CubeThread(int n) {
        num = n;
    }
    @Override
    public void run() {
        System.out.println("CubeThread: The cube of " + num + " is " + (Math.pow(num, 3)));
    }
}
