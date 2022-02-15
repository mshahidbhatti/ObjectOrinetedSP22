


//camel convention
//OopFirstClass
//oopFirstFunction

public class Demo {

    public static void main(String args[]){
   /*     int number1=0;
        short s=10;
        long l=67;
        byte x=30;

        float f=10;
        double d=100.0;
        boolean b=true;
        char ch='a';

        System.out.println("The date in int is:"+(number1+f));
        System.out.println("THe value is boolean " +b);

        System.out.printf("The value in double %.2f%n",f);
        System.out.printf("Char %c %n",ch);
        System.out.printf("boolean %b \n",b);

        System.out.printf("Name  : %-30s%n","Shahid");
        System.out.printf("Name : %-30s%n","Ali");
*/

        //A a; //declaration of variable
        //A a =new A(); //delcarataion and initialization
 /*       A a;
        a = new A();
        System.out.println(a);
        B b=new B();
        System.out.println(b);
        B b2=new B();
        System.out.println(b2);*/

        Person person1=new Person();
        System.out.println(person1);
        //person1.firstName="Name";
 /*       person1.setFirstName("First Name");
        System.out.println(person1.getFirstName());
        System.out.println(person1.lastName);
*/

        Rectangle r1=new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.setLength(20);
        System.out.println(r1.getLength());
        System.out.println(r2.getLength());

        System.out.println();

        /*Calculator cal=null;
        //int short long float double char boolean
        cal=new Calculator();.2

        //cal.subtract();
        System.out.println(cal.sum(20 , 30));
*/


    // System.out.printf("Hello World!");
    }
}
