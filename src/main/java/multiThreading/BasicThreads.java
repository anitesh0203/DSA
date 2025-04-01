package multiThreading;

public class BasicThreads extends Thread{
    @Override
    public void run() {
        //this contains the code used by the thread
        System.out.println(Thread.currentThread().getName()+"  is running!!");
    }

    public static void main(String[] args) {
        BasicThreads basicThreads = new BasicThreads();
        basicThreads.start();

    }
}
