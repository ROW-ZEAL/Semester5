package Week4.Week4_Exercise;
public class Bicycle extends Vehicle implements Interface.WheelSystem{
        public Bicycle(String t, int s){
            super(t, s);
        }
        public void displayTotWheel() {
            System.out.println("Bicycle has 2 wheels");
        }
}
