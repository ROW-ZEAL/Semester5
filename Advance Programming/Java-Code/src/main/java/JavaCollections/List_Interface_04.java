package JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class List_Interface_04 {
    public static void main(String[] args) {
// Syntax of Java List

        List<String> name = new ArrayList<>();
        name.add("Sandip Paudel");
        name.add("Sandip Paudel");
        name.add("Sandip Paudel");
        name.add("Sandip Paudel");

        System.out.println(name);

        // Methods Available

//        name.remove(Object / index)
        name.remove(3);
        System.out.println(name);

        name.add(2, "Raghu Paudel");
        System.out.println(name);

        // clear()
//        name.clear();

        // Is string present in list or not.
        System.out.println( name.contains("Raghu Paudel"));
        System.out.println( name.contains("Ram Paudel"));

        // get()
        System.out.println( name.get(3));

        // Find element index
        System.out.println(name.indexOf("Raghu Paudel"));

        // Different / Different datatype value add garney tei
        // same sab linklist rw Arrarylist jastai

//        List name = new ArrayList<>();


        // 1. Array lai List mha convert garney ..?

        String [] student_id = {
                "1001", "1002", "1003",
                "1004", "1005", "1006"
        };

        // convert student_id to list

        List<String> convertList = new ArrayList<>();

        for (String i: student_id
             ) {
            convertList.add(i);

        }

        System.out.println("Converted Array to List: ");
        System.out.println(convertList);









    }
}
