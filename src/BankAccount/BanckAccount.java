package BankAccount;

public class BanckAccount {
    //class attribute
    private String firstName;
    private String lastName;
    private double openingBalance;
    private int accountNumber;
    private String email;


    public BanckAccount(){

    }
    //constructor
    // module, no return type, name same as class name
    public BanckAccount(String firstName, String lastName, double openingBalance){
        this.firstName=firstName;
        this.lastName=lastName;
        this.openingBalance=openingBalance;
        this.accountNumber=this.accountNumber++;
        this.email="No Email Provided";
    }

    public BanckAccount(String firstName, String lastName, double openingBalance, String email){
        this(firstName,lastName,openingBalance);
        this.email=email;
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
        return String.format("Account Number:%d %n First Name :%s %n Last Name: %s%n Opening Balance: %.2f %n Email %s",getAccountNumber(),
                this.getFirstName(),getLastName(),getOpeningBalance(),getEmail());

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
