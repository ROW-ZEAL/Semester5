package QuestionsSolve.Array;

import java.util.Scanner;

public class qn_2 {
    public static void main(String[] args) {
        // 2. Write a java program to sum values of an array.


        int [] value = new int[5];
        int sum = 0;
        // Taking input from user

        Scanner src = new Scanner(System.in);

        for(int i = 1; i<value.length; i++){
            System.out.println("Enter a " + value.length + "values: ");
            value[i] = src.nextInt();

            sum += value[i];
        }

        System.out.println("The sum of enterd value is: " + sum);

    }
}
