package OtherCode;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
//        ArrayList -> a resizable array which only
//                store reference data type(Wappper Class)
//        -> Here, element can be added and removed after
//                compilation phase

        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");

//        System.out.println(food);
//        System.out.println(food.get(0));

        //  USeful Methods
        food.set(0, "sushi");
        food.remove(2);
//        food.clear(); -> Clear all list

        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }




    }
}

