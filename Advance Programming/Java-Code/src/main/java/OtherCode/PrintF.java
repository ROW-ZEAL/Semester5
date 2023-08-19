package OtherCode;

public class PrintF {
    public static void main(String[] args) {
// printf() -> an optional method to
// control, format, and display text to
// the console window.

// two-argument -> format string + (object/variable/value)

        System.out.printf("This is a format string %d", 123);
        // aba hami ley 123 lai display garnu paryo vaney
//        hamiley % use garnu parcha jata % used garincha tei
//                thau mha to display huncha
        System.out.println();
        System.out.printf("%d This is a format string", 123);

        System.out.println("\n================================");
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

//        [conversion-character]
//        System.out.printf("Boolean Value: %b\n", myBoolean);
//        System.out.printf("Character Value: %c\n", myChar);
//        System.out.printf("String Value: %s\n", myString);
//        System.out.printf("String Value: %d\n", myInt);
//        System.out.printf("Double Value: %f\n", myDouble);

        // [width]
        // to display minimum no. of characters to be written as output.

        System.out.printf("Hello %10s", myString);
        // this, Display minimum 10 no. of character
        // output mha ahgadi space aaucha tarw, -10 ley
//        backside mha space aaucha.


        // [precision]
        // sets no. of digits of precision when outputting
//        floating-point values

        System.out.printf("\nYou have this much money %.2f " , myDouble);
        // only 100.10 two digits after decimal.


        // [flags]
//        add an effect to output based on the flag added to format specifier
//                - : left-justify
//                + : utput a plus (+) or minus (-) sign for a numeric value
//                0 : numeric values are zero-padded
//                , :  comma grouping separator if numbers >

        System.out.printf("\nYou have this much money %20f " , myDouble);
        System.out.printf("\nYou have this much money %+f " , myDouble);
        System.out.printf("\nYou have this much money %020f " , myDouble);
        System.out.printf("\nYou have this much money %,f " , myDouble);

    }
}
