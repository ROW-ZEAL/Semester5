package JavaCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet_05 {
    public static void main(String[] args) {
        // Java linkedHashset contain unique elements only like HashSet.
        // -> it provides all optional set operation and permits null elements.
        // -> It is non synchronized.
        // -> It maintains insertion order.

        // -> LinkedHashSet class extends HashSet class which implements Set interface.

        LinkedHashSet ns = new LinkedHashSet();

        ns.add("Saradha");
        ns.add(10.44);
        ns.add(1000);
        ns.add(false);


        System.out.println(ns);

        // Iterator loop

        Iterator itr = ns.iterator();

        // .next() ley yeuta yeuta garerw print garnu parcha...
//        System.out.println(itr.next());
//        System.out.println(itr.next());

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Methods()
        // see all by .

    }
}
