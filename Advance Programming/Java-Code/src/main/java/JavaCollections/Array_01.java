package JavaCollections;

public class Array_01 {
    public static void main(String[] args) {

        // 1D-Array
//        int [] marks;

        // 2D-Array
        int [][] marks;
        marks = new int[3][3];

//        int [] [] marks = new int[2][3];

        marks[0][0] = 101;
        marks[0][1] = 102;
        marks[0][2] = 103;

        marks[1][0] = 104;
        marks[1][1] = 105;
        marks[1][2] = 106;

        marks[2][0] = 107;
        marks[2][1] = 108;
        marks[2][2] = 109;


        for(int i = 0; i < marks.length; i++){
            for(int j = 0; j < marks.length; j++){
                System.out.println(marks[i][j]);
            }
            System.out.println();
        }

        // To copy array to new array

        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a','t','e','d'};
        char[] copyTo = new char[10];

        // Using .arraycopy
        System.arraycopy(copyFrom, 0, copyTo, 0, 10);


//        for(char i:copyTo){
//            System.out.println(i);
//
//        }

        System.out.println(String.valueOf(copyTo));


        // Cloning an Array in Java

        int arr[] = {33,44,3,4,55};
        int cloneArr[] = arr.clone();

        for(int i:cloneArr){
            System.out.println(i);
        }


    }
}
