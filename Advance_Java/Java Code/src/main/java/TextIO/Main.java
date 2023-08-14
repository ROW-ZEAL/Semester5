package TextIO;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("/Users/sandip/Documents/Github/Semester-5/Advance_Java/Java Code/src/main/java/TextIO/scores.txt");
//        java.io.File -> REad the file
//        java.io.PrintWriter -> Write inside the file

        if(file.exists()){
            System.out.println("Fie already exists");

            System.exit(1);
        }

        java.io.PrintWriter output = new java.io.PrintWriter("/Users/sandip/Documents/Github/Semester-5/Advance_Java/Java Code/src/main/java/TextIO/scores.txt");

        output.print("John T Smith");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

        output.close();
    }
}
