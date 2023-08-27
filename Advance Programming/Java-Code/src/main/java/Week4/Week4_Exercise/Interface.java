package Week4.Week4_Exercise;

public class Interface {

    // What is Interface?
    // -  In Java, an interface is a reference type that
    // is similar to a class. It is a collection of abstract methods,
    // which means methods that have no-body and only declarations.


    // Interface 1 - Wheel System
    public interface WheelSystem {
        public void displayTotWheel();
    }

    // Interface 2 - Flight System
    public interface FlightSystem {
        public void displayMaxAltitude();
    }

    //     Interface 3 - Engine system
    public interface Engine {
        public void startEngine();

    }
    //2. Add interface Registration to the vehicles that require
    // compulsory registration. All air-crafts and motorbikes
    // require registration number.

    public interface Registration{
        public void Comp_registration(String reg);
    }
}
