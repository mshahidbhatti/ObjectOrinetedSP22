package Week7;

public class Demo {
    public static void main(String[] args) {

        //refrence of parent class
        A obj;
        //obj=new A();  abstract class can not be instantiated

        obj=new B();
        //late binding
       // obj.a();

        //early binding
       // obj.c();

        System.out.println(obj.x);

        B obj1=new B();
        System.out.println(obj1.x);


/*        Vehicle[] array=new Vehicle[5];
        array[0]=new Bike();
        array[1]=new Car();
        array[2]=new Car();
        array[3]=new Bike();


        steerCall(array);*/

    }

    public static void steerCall(Vehicle list[]){
        for(Vehicle v:list)
            if(v!=null)
                v.steer();
    }

    public Car[] getCarsFromVehicle(Vehicle list[]){
        int counter=0;
        for(Vehicle v:list)
            if(v instanceof Car)
                    counter++;

            Car c[]=new Car[counter];
            for(int i=0;i<list.length;i++) {
                if (list[i] instanceof Car)
                    c[i] = (Car) list[i];
            }
                return c;
    }

}
