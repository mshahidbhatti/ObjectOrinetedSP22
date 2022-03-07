package Week3;

public class Demo {
    public static void main(String[] args) {
        B b=new B(5);

        A obj1=new A(10, new B(4));
        A obj2=new A(12, new B(100));


        A temp4= new A(obj2);
        //obj1=obj2;


        A temp=new A(5,new B(200));

        //
        //A temp2=new A(temp.getData1(), temp.getB());
        A temp2 = new A(temp.getData1(), new B(temp.getB().getDataB()));
        //A temp2 = new A(temp.getData1(), null);

        //temp=null;
        System.out.println(temp.getB());





/*
        //temp=obj1;

        System.out.println("Temp"+temp);

        //obj2.setData1(15);

        System.out.println("Obj1"+obj1);*/

    }
}
