package OtherCode;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
//        foreach - to iterate through the element
//                in an array/collection


        String[] animals = {"cat", "dog", "rat", "bird"};

        // Try with 2d array
//        ArrayList<String> animals = new ArrayList<String>();
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("rat");
//        animals.add("bird");

        // foreach loop
        for (String i : animals
             ) {
            System.out.println(i);

        }
    }
}
