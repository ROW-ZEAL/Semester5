package Week4;

public class HashMap {
    public static void main(String[] args) {
        // Hashmap - store items in key/value pairs.
        // - One object is used as a key(index) to another object(value).

        // - Can store different types: String key and Integer values,
        // or the same type, like: String key and String value.


        // Create a HashMap object called capitalCities
        java.util.HashMap<String, String> capitalCities = new java.util.HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        // Access a value using get("Key rakhney") method
        System.out.println(capitalCities.get("London"));

        // to remove an item -> .remove("Key rakhney")
        System.out.println(capitalCities.remove("England"));
        System.out.println(capitalCities);

        // to remove all item -> use clear() method

        // Size tha pauna ko lagi- > kati size ko cha .size() method

        System.out.println(capitalCities.size());


        // Looping Garney??

        // yesmha .keySet() ley key lai access garney
        // ane .values() ley value haru lai matrw access garnu milcha.

        for(String i: capitalCities.keySet()){
            System.out.println(i);
        }

        for(String i: capitalCities.values()){
            System.out.println(i);
        }

        // To print both ??

        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " || value: " + capitalCities.get(i));
        }




    }
    }
