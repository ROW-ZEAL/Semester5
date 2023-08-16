package TextIO;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("/Users/sandip/Documents/Github/Semester-5/Advance_Java/Java Code/src/main/java/TextIO/scores.txt");

////        java.io.File -> REad the file

//        if(file.exists()){
//            System.out.println("Fie already exists");
//
//            System.exit(1);
//        }


        // java.io.PrintWriter -> Write inside the file

//        java.io.PrintWriter output = new java.io.PrintWriter(file);
//
//        output.print("John T Smith ");
//        output.println(90);
//        output.print("Eric K Jones ");
//        output.println(85);
//
//        output.close();



        // To print file data into terminal using scanner
        Scanner input = new Scanner(file);

        while (input.hasNext()){
//            next() - ley space na aauney samma data read garcha

            String firstName = input.next();
            String middleName = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(
                    firstName + " " + middleName + " " + lastName + " " + score
            );
        }

        input.close();

    }

}
