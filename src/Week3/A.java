package Week3;

public class A {
    private int data1;

    private B b;   //composition

    //copy constructor
    A(A a){
        this.data1=a.data1;
      //  this.b=a.b;
        this.b.setDataB(a.getData1());
    }

    public A(int data1, B b) {

        this.data1 = data1;
        this.b=b;
    }
    public A(){}

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    @Override
    public String toString() {
        return "A{" +
                "data1=" + data1 +
                '}';
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }
}
