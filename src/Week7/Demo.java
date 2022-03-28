package Week7;

public class Demo {
    public static void main(String[] args) {



        Vehicle[] array=new Vehicle[5];
        array[0]=new Bike();
        array[1]=new Car();
        array[2]=new Car();
        array[3]=new Bike();


        steerCall(array);

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
