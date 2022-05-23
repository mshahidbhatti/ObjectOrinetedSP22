package Week12;

// A Java program that illustrates Callable
// to generate and return a random number between 0 - 9

// import statments
import java.util.concurrent.Callable;
import java.util.Random;

// importing the concrete class FutureTask
import java.util.concurrent.FutureTask;

class JavaCallable implements Callable
{
    @Override
    public Object call() throws Exception
    {
// Creating an object of the  Random class
        Random randObj = new Random();

// generating a random number between 0 to 9
        Integer randNo = randObj.nextInt(10);

// the thread is delayed for some random time
        Thread.sleep(randNo * 1000);

// return the object that contains the
// generated random number
        return randNo;
    }
}

