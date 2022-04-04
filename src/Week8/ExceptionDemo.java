package Week8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Welcome to our software");
        Scanner sc=new Scanner(System.in);



        try {
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x / y);
        }

        catch (InputMismatchException e){
            System.out.println("input mismatch"+e.getMessage());

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Throwable e){

        }
        finally {
            System.out.println("finally block executed");
        }




        System.out.println("Thank you for using this application");

    }
}
