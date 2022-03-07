package BankAccount;

public class Demo {
    public static void main(String[] args) {
        //   BanckAccount.nonSense();
        //  BanckAccount ac=new BanckAccount("Muhammad","Abrar",500.0);

        BanckAccount account1=new BanckAccount("Muhammad","Abrar",500.0);
        BanckAccount account2=new BanckAccount("Umair","Zafar",1000.0);
        //Date date1=new Date(22,2,2022);
        BanckAccount account3=new BanckAccount("Zaman","Khan",0.0,
                "zaman@gmail.com",new Date(22,2,2022));

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);


        //BanckAccount.nonSense();




    }
}
