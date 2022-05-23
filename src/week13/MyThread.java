package week13;

public class MyThread extends Thread{


    @Override
    public void run(){
        while (true) {
            System.out.println("Thread 1 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
