package Week4_Exercise;

public class JetSki extends Vehicle implements Interface.Engine{
    public JetSki(String t, int s) {
        super(t, s);
    }
    public void startEngine() {
        System.out.println("JetSki engine starts - vroosh...vroosh...");
    } }

