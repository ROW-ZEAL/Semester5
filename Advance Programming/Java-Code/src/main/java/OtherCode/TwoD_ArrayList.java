package OtherCode;

import java.util.*;
public class TwoD_ArrayList {
    public static void main(String[] args) {
//        2D ArrayList -> a dynamic list of lists
//        -> We can change the size of these lists during runtime

//        2d_ArrayList have all below item in one arraylist
        ArrayList<ArrayList<String>>  groceryList = new ArrayList<>();


        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");

        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("Coco-cola");
        drinksList.add("Coffee");

        // now we add each list we created in 2d array
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);


        System.out.println(groceryList);

        System.out.println(groceryList.get(0).get(1));
        // arraylist ko first ko index 1 ko value dincha






        System.out.println(bakeryList.get(0)); // index -0
    }
}
