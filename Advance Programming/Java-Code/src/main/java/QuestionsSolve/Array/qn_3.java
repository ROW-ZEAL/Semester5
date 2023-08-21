package QuestionsSolve.Array;

public class qn_3 {
//    5. WAP to test if an array contains a specific value.
public static void main(String[] args) {

    String[] name = {
            "Ram", "Shyam", "Hari",
            "Gita", "Sita", "Samikshya"
    };

    // check if Hari is present in array or not

    for(int i = 0; i<name.length; i++){

        if(name[i].equals("Hari")){
            System.out.println(name[i] + ", is presented in array at index "+ i);

        }

    }
}
}
