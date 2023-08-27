package Week4.Week4_Exercise;

public class Gilder extends Vehicle implements Interface.WheelSystem, Interface.Engine, Interface.FlightSystem{
    // Now, EXERCISE

    //1. Add Glider class to the program. A Glider has no engine.
    //It has 3 wheels and maximum altitude of 3000m.Create a
    // glider object and display all necessary details.

    //2. Add interface Registration to the vehicles that require
    // compulsory registration. All air-crafts and motorbikes
    // require registration number.

    public Gilder (String t, int s){
        super(t,s);
    }


    @Override
    public void displayTotWheel() {
        System.out.println("It has 3 wheels.");

    }

    @Override
    public void displayMaxAltitude() {
        System.out.println("Maximum altitude is 3000m.");

    }

    @Override
    public void startEngine() {

    }
}
