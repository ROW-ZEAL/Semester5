package QuestionsSolve.Array;

import java.util.Arrays;

public class qn_1 {
    public static void main(String[] args) {
        // 1. Write a Java program to sort a numeric array and a string array.

       int[] arr1 = {
               1001, 2001, 3001, 4001,
               805, 101, 404, 202,
               4001, 603, 5005, 550};

       String[] arr2 = {
               "Manoj", "Subash", "Aashish",
               "Bimal", "Kabin", "Kushal",
               "Hari", "Kamal", "Ganesh"
       };

        System.out.println("Original numeric Array: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Sorted numeric Array: " + Arrays.toString(arr1));

        System.out.println();
        System.out.println("Original String Array; " + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("Sorted string Array; " + Arrays.toString(arr2));
    }
}
