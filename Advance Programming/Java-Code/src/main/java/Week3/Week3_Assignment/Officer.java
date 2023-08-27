package Week3.Week3_Assignment;

public class Officer extends Employee_3{
    private final double petrol;
    private final int yearborn;

    public Officer(String n, double s, double p, int y) {
        super(n, s);
        petrol = p;
        yearborn = y;
    }

    public double getPetrol() {
        return petrol;
    }

    public int getAge(){
        return (2014 - yearborn);
    }


    public void displayDetail() {
        super.displayDetail();
        System.out.println("AGE : " + getAge());
        System.out.println("PETROL : " + petrol);

    }

}
