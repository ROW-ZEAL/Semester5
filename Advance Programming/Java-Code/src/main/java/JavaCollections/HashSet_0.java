package JavaCollections;

import java.util.HashSet;

public class HashSet_0 {
    public static void main(String[] args) {
        // Hashset ley element store gardha hashing mechanism used garcha.
        // -> NOTE: Yesmha only unique element lai matrw contain garcha.
        // -> Null value allowed.
        // -> Non-synchronized class
        // Yesmha, insertion order maintain hudaina. Yesmha
        // element haru insert base on their hashcode huncha.

        // Yo best, approach for search operation.


        // REMEMBER: List ley duplicate lincha
        // Set ley unique element matrw lincha.

        // 1. Create HashSet

        HashSet<String> ns = new HashSet<String>();

        ns.add("Mahendar");
        ns.add("Mahendar");
        ns.add("Chatan");
        ns.add("Chatan");

        System.out.println(ns);
        // yesmha duplicate element add hudaina

        // for each

        for (String i:ns
             ) {
            System.out.println(i);

        }

        // remove() method
        ns.remove("Mahendar");
        System.out.println(ns);

        // Add null value

        ns.add(null);
        System.out.println(ns);

        // Add another hashset to ns

        HashSet<String> ns_new = new HashSet<String>();
        ns_new.add("Iphone");
        ns_new.add("Samsung");
        ns_new.add("Oppo");

        ns.addAll(ns_new);

        System.out.println("Added 2 hashset: " +ns);


        // remove ns_new list from ns list
        ns.removeAll(ns_new);
        System.out.println("Removed: " + ns);

        // method -> clear, iterator, isempty() and many more.

        System.out.println("Is Ns list empty: " + ns.isEmpty());




    }
}
