package OtherCode;
public class arrays {
    public static void main(String[] args) {
//         Array is used to store multiple values in a single variable

        String[] cars = {"Camaro", "Corvette", "Tesla"};
        System.out.println(cars[0]);

        cars[0] = "Mustang";
        System.out.println(cars[0]);

        // Another way to create an array

        String[] name = new String[4];
        name[0] = "Manoj";
        name[1] = "Subash";
        name[2] = "Binod";
        name[3] = "Kabin";

        for(int i=0; i<=name.length; i++){
            System.out.println(name[i]);
        }



    }
}
