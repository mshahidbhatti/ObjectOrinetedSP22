package Week3;

public class B {
    private int dataB;

    public B(int dataB) {
        this.dataB = dataB;
    }

    public int getDataB() {
        return dataB;
    }

    public void setDataB(int dataB) {
        this.dataB = dataB;
    }

    @Override
    public String toString() {
        return "B{" +
                "dataB=" + dataB +
                '}';
    }


    public boolean equals(Object o2){
        Object o3=new B(10);
        return false;
    }



}
