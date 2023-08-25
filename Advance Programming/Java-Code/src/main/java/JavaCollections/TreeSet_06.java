package JavaCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_06 {
    public static void main(String[] args) {
        // TreeSet -> implements the Set interface that uses a tree for storage.
        // -> Contains unique elements only like HashSet.
        // -> In this, access and retrieval times are quiet fast.
        // -> It doesn't allow null elements.
        // -> NOTE: It is non synchronized.
        // -> In this, It maintains ascending order.
        // Random element input lai ascending order mha dincha...


        TreeSet<String> ts = new TreeSet<String>();
        ts.add("BMW");
        ts.add("AUdi");
        ts.add("Mercedes");
        ts.add("Toyota");
        ts.add("Tesla");

        System.out.println(ts);


        TreeSet<Integer> ns = new TreeSet<Integer>();
        ns.add(100);
        ns.add(10);
        ns.add(1);
        ns.add(4);
        ns.add(14);

        // Ascending order mha dincha
        System.out.println(ns);

        // Method
        // 1. pollfrist() rw polllast()

        System.out.println("First: " + ns.pollFirst());
        System.out.println("Last: " + ns.pollLast());

        // Store particular value in variable

        int numbers = ns.pollFirst();
        System.out.println("Store value: " + numbers);

        // reverse(), element present or not, and more ....

        TreeSet<String> js = new TreeSet<String>();
        js.add("A");
        js.add("B");
        js.add("C");
        js.add("D");
        js.add("E");

        // 1. reverse - using descendingSet()
        System.out.println("Reversed: " + js.descendingSet());

        // kun particular element samma print garney tw....
        // 2. USed -> .headSet()
        System.out.println(js.headSet("C", true));
        // true na rakhye C lai include gardaina.

        // 3. subSet()
        System.out.println(js.subSet("A", false, "E", true));
        // kun element batw kun samma - include garney vaye True natrw False.

        // 4. tailSet()
        // backward batw kun element samma print garney tw..

        System.out.println(js.tailSet("C", false));


        // Use Iterator()
        // Descending order mha print gardai yesmha...

        Iterator itr = js.descendingIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }












    }
}
