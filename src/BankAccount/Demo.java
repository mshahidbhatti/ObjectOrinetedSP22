package BankAccount;

public class Demo {
    public static void main(String[] args) {
        BanckAccount account1=new BanckAccount("Muhammad","Abrar",500.0);
        BanckAccount account2=new BanckAccount("Umair","Zafar",1000.0);

        BanckAccount account3=new BanckAccount("Umair","Zafar",1000.0,"myemail@gmail.com");




        //account1.display();
        //account2.display();
       // String accountData=account1.getAccountDetails();

     //   System.out.println(accountData);
        //cannot invoke default constructor
        //BanckAccount account2=new BanckAccount();
        System.out.println(account1);

        System.out.println(account3);


    }
}
