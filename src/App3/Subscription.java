package App3;

import java.util.Random;
import java.util.Scanner;

public class Subscription {
    static Scanner sc;
    private String myPasword;
    private String user="";

    private static int subscribersCounter=0;

    public Subscription(String myPasword, String user) {
        sc= new Scanner(System.in);

        setMyPasword(myPasword);
        setUser(user);
       // welcomeInterface(user);
        subscribersCounter++;
    }

    public Subscription(){
        sc= new Scanner(System.in);
        mainMethod();
        welcomeInterface(user);
    }

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Subscription.sc = sc;
    }

    public String getMyPasword() {
        return myPasword;
    }

    public void setMyPasword(String myPasword) {
        if(myPasword.length()>=3)
           this.myPasword = myPasword;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        if(user.length()>0)
            this.user = user;
    }

    private  void mainMethod() {
        int choice=-1;
        user="";
        String password="";

        while(true){
            menue();
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Email");
                    String myEmail=sc.next();
                    System.out.println("Enter Password:");
                    myPasword=sc.next();

                    if(password.equals(myPasword)&user.equals(myEmail))
                        welcomeInterface(user);
                    else
                        System.out.println("Incorrect Password");
                    break;

                case 2:
                    System.out.println("Enter New User: ");
                    user=sc.next();
                    System.out.println("Enter New Password");
                    password=sc.next();
                    if(password.length()>=3) {
                        System.out.println("welcome to :" + user);
                    }
                    else
                        System.out.println("Error: Passord is not correct");
                    break;
                case 3:
                    System.out.println("Good Bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }

    public static void menue(){

        System.out.println("1 - Sign in");
        System.out.println("2 - Create Account");
        System.out.println("3 - Cancel");
    }

    public void newUser(){
        System.out.println("Enter New User: ");
        System.out.println("Enter New Password");
    }

    public boolean addNewUser(){
        return false;
    }


    public void welcomeInterface(String user){
        System.out.println("Welcome to "+user);
        System.out.println("1- Check email");
        System.out.println("2- Check Password");
        int choice=-1;
        Random ran = new Random();
        choice=sc.nextInt();
        String message="";
        System.out.println(choice==1?"You have "+ran.nextInt(20)+" New emails.":"You have"+ ran.nextInt(20)+"10 new sms!");
    }
}
