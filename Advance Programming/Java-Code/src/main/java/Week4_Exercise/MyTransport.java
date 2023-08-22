package Week4_Exercise;

public class MyTransport {
    // Superclass - yo batw hami ley sab display garcham

    public static void main(String[] args) {
        JetSki js = new JetSki("water", 40);
        Bicycle b = new Bicycle("land", 20);
        Motobike mb = new Motobike("land", 200);
        Aircraft a = new Aircraft("air", 1000);
        js.startEngine();
        b.displayTotWheel();
        mb.startEngine();
        mb.displayTotWheel();
        a.startEngine();
        a.displayTotWheel();
        a.displayMaxAltitude();
    }
}
