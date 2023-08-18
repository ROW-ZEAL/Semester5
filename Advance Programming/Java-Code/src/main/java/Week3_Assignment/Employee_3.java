package Week3_Assignment;

public class Employee_3 {

    private final String name;
    private double salary;
    private boolean status;

    Employee_3(String n, double s) {
        name = n;
        salary = s;
        status = true;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double s) {
        if (s < 25000)
            salary = s;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status ? "active" : "resigned";
    }

    public void resigned() {
        status = false;
    }
    public void displayDetail() {
        System.out.println("---------------------------");
        System.out.println("NAME : " + name);
        System.out.println("SALARY : " + salary);
        System.out.println("STATUS : " + getStatus());
    }
}
