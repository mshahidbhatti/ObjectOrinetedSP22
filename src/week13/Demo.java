package week13;

public class Demo {
    public static void main(String[] args) {


        MyThread th=new MyThread();
        Thread2 th2=new Thread2();
        th.start();
        th2.start();

        /*Thread th3=new Thread(new WordCount());
        th3.start();
*/

            WordCount wc=new WordCount();
            wc.run();


    }
}
