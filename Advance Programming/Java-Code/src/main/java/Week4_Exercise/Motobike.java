package Week4_Exercise;

public class Motobike extends Vehicle implements Interface.Engine, Interface.WheelSystem {
        public Motobike (String t, int s){
            super(t,s);
        }
        public void startEngine(){
            System.out.println("Motobike engine starts - vroom....vroom....");
        }
        public void displayTotWheel(){
            System.out.println("Motobike has 2 wheels");
        }


}


