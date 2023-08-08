import java.util.Scanner;

//Task 1: Take 1 input from the user and print in java consle
public class week2 {

//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter 1st num: ");
//        int input = scan.nextInt();
//        System.out.println("Enter 2nd num: ");
//        int input2 = scan.nextInt();
//
//
//        System.out.println("Your number is: " + input + ", " + input2);
//
//
//    }

//-----------------------------------------------------------
//Exception handelling using if else statement

        public static int quotient(int num1, int num2){

                if(num2 == 0){
                        throw new ArithmeticException("Divisor cannot be zero.");
                }

                return num1 / num2;
        }

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 1st num: ");
        int input = scan.nextInt();
        System.out.println("Enter 2nd num: ");
        int input2 = scan.nextInt();

        //  int result = quotient(input, input2);


        try{
                int result = quotient(input, input2);
                System.out.println(input + " / " + input2 + " is : " + result );


        }
        catch (ArithmeticException ex){
                System.out.println("Exception an integer " + "cannot be divided by zero.");
        }
                System.out.println("Exception contineous......");








//        if(input2!=0){
//                System.out.println(input + "/ " + input2 + "is" + result );
//        }
//        else{
//                System.out.println("Zero value entered. Can't perform.......");
//        }




    }




}
