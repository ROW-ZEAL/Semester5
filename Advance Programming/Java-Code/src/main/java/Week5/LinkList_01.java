package Week5;

import java.util.LinkedList;

public class LinkList_01 {
    public static void main(String[] args) {
        LinkedList<String> li = new LinkedList<String>();


        // Add elements
        // Can add First and Last - using addFirst, addLast

        li.add("A");
        li.add("B");
        li.addLast("C");
        li.addFirst("D");
        li.add(2, "E");

        System.out.println(li);

        // remove
        li.remove("B");
        System.out.println(li);
        li.remove(3); // index
        System.out.println(li);


    }
}
