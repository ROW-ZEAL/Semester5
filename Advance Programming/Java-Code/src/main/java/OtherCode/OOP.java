package OtherCode;

public class OOP {
    public static void main(String[] args) {

        // object -> an instance of a class that
//        may contain attributes and methods

        // example: (phone, desk, computer, coffee cup)

        // Main class - OOP
        // SUb class - Car

        Car mycar1 = new Car();
        // yo vaye c hami ley mycar batw
//        car vaney sub-class ko sab attribute lai
//        access garney milney vo.


//        NOTE: We can use this car class to create
//                multiple instances (We can reuse this
//    Car class to create multiple objects.)

        Car myCar2 = new Car();



        System.out.println(mycar1.make);
        System.out.println(mycar1.model);
        System.out.println();
        System.out.println(myCar2.make);
        System.out.println(myCar2.model);

//        mycar.drive();
//        mycar1.brake();






    }

}

