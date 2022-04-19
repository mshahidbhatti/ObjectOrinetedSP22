package Week8;

public class MyException extends ArithmeticException{



    @Override
    public String getMessage(){
        return "Custom exception is called";
    }
}
