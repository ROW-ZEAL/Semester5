package OtherCode;
public class Two_D_Arrays {
//    2D Arrays = an array of arrays

    public static void main(String[] args) {

        String[][] cars = new String[3][3]; // 3 array with each contain 3 element


        // Add element in 3 arrays
        cars[0][0] = "Mustang";
        cars[0][1] = "Corvette";
        cars[0][2] = "Camaro";
        cars[1][0] = "Silverado";
        cars[1][1] = "Ranger";
        cars[1][2] = "F-150";
        cars[2][0] = "Lambo";
        cars[2][1] = "Ferrari";
        cars[2][2] = "Tesla";


//        OR we can add element direct while creating an array

//        String [][] cars =  {
//                {"Mustang","Corvette","Camaro"}, {"Silverado", "Ranger", "F-150"}, {"Lambo", "Ferrari", "Tesla"}
//
//        };

        for(int i=0; i<cars.length; i++){
            System.out.println();
            for (int j=0; j<cars[i].length; j++){
                System.out.println(cars[i][j]);
            }
        }



    }
}
