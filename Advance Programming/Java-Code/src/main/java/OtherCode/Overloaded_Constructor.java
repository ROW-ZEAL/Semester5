package OtherCode;

public class Overloaded_Constructor {
    public static void main(String[] args) {

        // overloaded constructors - which means multiple constructors
        // within a class with the same name, but have different parameters.

        // name + parameters = signature.


        Pizza pizza = new Pizza("Garlic Bread", "Tomato", "Makroroni", "pepperoni");

        System.out.println("Here are the ingredients of your pizza: ");

        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        // If i only want to have bread, and cheese than i can't pass that
        // from this method, as it pass 4 parameter to pizza class.
         





    }
}
