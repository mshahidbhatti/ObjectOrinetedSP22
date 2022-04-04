package Week7;

//super class/ super typer/ parent class
public abstract class A {

    int x=10;
    //abstract method
    public abstract void a();

    public void c(){

    }
    public void c(int x){

    }

    //static method
    public static void staticMethod(){
        System.out.println("Parent class static method call");
    }

    public final void finalMethod(){
        System.out.println("Call to final method of class A");
    }
}
