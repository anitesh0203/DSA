package multiThreading;

public class RunnableThread implements Runnable{
    @Override
    public void run() {
        System.out.println("The thread running is :  "+ Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableThread runnableThread = new RunnableThread();

        for (int i=0 ;i<5; i++) {
            Thread thread = new Thread(runnableThread);
            Thread.sleep(2000);
            thread.start();
        }
    }
}
