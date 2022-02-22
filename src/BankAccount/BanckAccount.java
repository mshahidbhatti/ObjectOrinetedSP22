package BankAccount;

public class BanckAccount {
    //class attribute
    //class attribute
    private static int accountCounter;

    //instance specific attributes
    private String firstName;
    private String lastName;
    private double openingBalance;
    private int accountNumber;
    private String email="No Email Provided";
    private Date openingDate;


/*
    static{
        for(int i=0;i<10;i++)
            System.out.println(i);
    }

    {
        System.out.println("Welocme to our bank");
    }
*/



    //constructor
    // module, no return type, name same as class name
    public BanckAccount(String firstName, String lastName, double openingBalance){
        this.firstName=firstName;
        this.lastName=lastName;
        this.openingBalance=openingBalance;
        this.accountNumber=++accountCounter;
        //print

    }

    //this() is call to default constructor
    public BanckAccount(String firstName, String lastName, double openingBalance, String email,Date openingDate){
        //call to four parameters constructor
        this(firstName,lastName,openingBalance);
        this.email=email;
        this.openingDate=openingDate;
        //print
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
//can not be updated
    /*public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }*/

    public void display(){
        System.out.printf("Account Number:%d %n",getAccountNumber());
        System.out.printf("First Name :%s %n",this.getFirstName());
        System.out.printf("Last Name: %s%n",getLastName());
        System.out.printf("Opening Balance: %.2f %n",getOpeningBalance());
    }

    public String toString(){

        //return "Account Number:"+accountNumber+"%nFirst Name: "+firstName+"\n"+"Last Name:"+lastName+
        //        "\n"+"Opening Balance:"+openingBalance+"\n";
        return String.format("Account Number:%d %n First Name :%s %n Last Name: %s%n Opening Balance: %.2f %n Email %s%n Opening Date %s",getAccountNumber(),
                this.getFirstName(),getLastName(),getOpeningBalance(),getEmail(),openingDate);

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        //nonSense();
    }

/*    public static void nonSense(){
        //this.getEmail();
        System.out.println("Non Sense function");
    }*/
}
