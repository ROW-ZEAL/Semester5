package JavaCollections;

import java.util.LinkedList;

public class LinkedList_03 {
//    - Uses a doubly linked list to store
//    the elements.

    public static void main(String[] args) {

        LinkedList<String> a1 = new LinkedList<String>();
        // - duplicate element nii allow huncha
        // As, list chai unordered collection.

        a1.add("Manoj Paudel");
        a1.add("Subash Chhetri");
        a1.add("Kushal Pandey");
        a1.add("Ram Bdr Pandey");
        a1.add("Binod Regmi");
        a1.add("Manoj Paudel"); // duplicate element

        System.out.println(a1);



        // Methods

        // Add element in particular index.
        a1.add(3, "Ram Krishna Parsad");
        System.out.println(a1);

        // 2.
        LinkedList<String> name = new LinkedList<String>();

        name.add("Prabin");;
        name.add("Sudip");;
        name.add("pradeep");;

        // Add name list value to a1..
        a1.addAll(name);
        System.out.println(a1);

        // Addfirst() method

        a1.addFirst("Saradha Paudel");
        System.out.println(a1);

        // To add element in last without knowing last elememt index

        a1.addLast("Last Name");
        System.out.println(a1);

        // Remove from particular place

        // Wee can give position (index) or also element name too.
        a1.remove(0);
        System.out.println(a1);

        a1.remove("Kushal Pandey");
        System.out.println(a1);

        // To remove the whole Linklist ?
        // Here, remove name list....
        a1.removeAll(name);
        System.out.println(a1);


//        To clear whole linklist data

//        a1.clear();
//        System.out.println(a1);

        // -> Linklist mha vayeko element lai String variable mha add garnu
        // paryo vaney ...?

        String copyName = a1.get(0);
        System.out.println(copyName);

        // remove, clear(), clone() and many more...


        // IF Linkedlist mha different/different datatype add garnu
        // paryo vaney...

        LinkedList news = new LinkedList();
        news.add("Manoj Paudel");
        news.add(34560);
        news.add(true);
        news.add(15.655);

        System.out.println();
        System.out.println(news);




















    }

}
