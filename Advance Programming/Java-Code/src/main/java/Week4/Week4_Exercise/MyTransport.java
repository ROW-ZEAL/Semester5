package Week4.Week4_Exercise;

public class MyTransport {
    // Superclass - yo batw hami ley sab display garcham

    public static void main(String[] args) {
        JetSki js = new JetSki("water", 40);
        Bicycle b = new Bicycle("land", 20);
        Motobike mb = new Motobike("land", 200);
        Aircraft a = new Aircraft("air", 1000);
        Gilder gd = new Gilder("Land", 3000);
        js.startEngine();
        b.displayTotWheel();
        mb.startEngine();
        mb.displayTotWheel();
        mb.Comp_registration("12233423");
        a.startEngine();
        a.displayTotWheel();
        a.displayMaxAltitude();
        a.Comp_registration("12345483");
        gd.displayMaxAltitude();
        gd.displayTotWheel();

    }

    // Now, EXERCISE

    //1. Add Glider class to the program. A Glider has no engine.
    //It has 3 wheels and maximum altitude of 3000m.Create a
    // glider object and display all necessary details.

    //2. Add interface Registration to the vehicles that require
    // compulsory registration. All air-crafts and motorbikes
    // require registration number.

}
