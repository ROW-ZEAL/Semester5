package JavaCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayList_02 {
    public static void main(String[] args) {
        // Arraylist class ley dynamic array uses garcha element store garna ko lagi.
        // It is like an array, but there is no size limit. (Tarw array mha size limit huncha | yekchoti size define garec)
        // We can add or remove, elements anytime. Tesailey,
        // yo array much more flexible huncha traditional array vandha.

        ArrayList<String> name = new ArrayList<String>();

        // add element in list
        name.add("Manoj Paudel");
        name.add("Subash Chhetri");
        name.add("Kushal Pandey");
        name.add("Ram Bdr Pandey");
        name.add("Binod Regmi");

        // Print arraylist
        System.out.println(name);
        // Iterator use garerw nii milcha
        // or for:each ley nii milcha

        Iterator it = name.iterator();
        while(it.hasNext()){
            // hasNext() ley each element yek paxi aarkko herdai jancha
            System.out.println(it.next());
        }

        // name van ney arraylist batw element lai aarko mha copy garna lai
        // .get() use garna milcha

        System.out.println();
        String name2 = name.get(1);
        System.out.println(name2);

        // To remove
        name.remove(3); // Ram Bdr Pandey
        System.out.println(name);

        // To know size of list
        System.out.println(name.size());

        // To replace list element to another.
        // jastai -> kushal pandey lai kabin shrestha

        name.set(2,"Kabin Shrestha");
        System.out.println(name);

        // To sort alphabet wise aka. Ascending order
        // Collection use garnu parney huncha

        Collections.sort(name);
        for (String i:name
             ) {
            System.out.println( "Sorted: " +i);

        }

        // 2 ota arraylist chan (al1 rw al2)
        // If, al2 ko sab element al1 mha rakhnu paryo vaney...?

        ArrayList<String> age = new ArrayList<String>();
        age.add("12");
        age.add("22");
        age.add("24");
        age.add("27");

        // Now, age ko element sab name mha add garney ko lagi....?
        // addAll() use garnu parcha...

        name.addAll(age);

        System.out.println("Added age list: " + name);


        // - If number rw string yeutai Arraylist mha add garnu paryo vaney..?

        ArrayList numbername = new ArrayList();
        numbername.addAll(name);
        numbername.add(986985);
        numbername.add(98698);
        numbername.add(9867);
        System.out.println("Both number + string: " + numbername);



    }
}
