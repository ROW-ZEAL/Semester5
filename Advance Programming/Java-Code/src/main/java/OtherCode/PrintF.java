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
        double myDouble = 100.1;

//        [conversion-character]
        System.out.printf("Boolean Value: %b\n", myBoolean);
        System.out.printf("Character Value: %c\n", myChar);
        System.out.printf("String Value: %s\n", myString);
        System.out.printf("Double Value: %f\n", myDouble);
s

    }
}
