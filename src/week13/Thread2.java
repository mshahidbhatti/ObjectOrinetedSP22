package week13;

public class Thread2 extends Thread{

    public void run(){
        while (true) {
            System.out.println("Thread 2 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
