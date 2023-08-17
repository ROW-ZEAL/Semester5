package OtherCode;

public class Methods {
    public static void main(String[] args) {
//        Like function in python.
//        only execute whenever method is called.

        /// call hello() method
//        String name = "Sandip";
//        int age = 21;
//        hello(name, age);

//        For return example

        int x = 3;
        int y = 4;

        int z = sumOf(x, y);
        System.out.println("Sum is: " + z);

    }

//    public static void hello(String name, int age){
////        System.out.println("Hello, "  + name +
////                " This is method called..");
//
//                System.out.println("Hello, "  + name +
//                "\nYour age is " + age);
//    }

    // Return Type

    public static int sumOf(int a, int b){
        return a + b;
    }



}
