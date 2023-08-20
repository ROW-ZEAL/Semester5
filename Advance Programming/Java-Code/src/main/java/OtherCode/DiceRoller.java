package OtherCode;

import java.util.Random;

public class DiceRoller {
    // Yo, varible_Scope.java ko part ho....

    // global varialbe
    Random random = new Random();
    int number = 0;

// constructor
    DiceRoller(){
//        Random random = new Random();
//        int number = 0;

//        roll(random, number); // we can pass the local variable to another methods as an argument also.

    }

    void roll(){

        number = random.nextInt(6) + 1;


    }

}
