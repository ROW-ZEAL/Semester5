package OtherCode;

public class constructor {
    public static void main(String[] args) {
        // constructor -> special method that is called when
//        an object is instantiated (created)

        human_constructor_part human1 = new human_constructor_part("Manoj Paudel", 23, 57);
        human_constructor_part human2 = new human_constructor_part("Subash Chhetri", 28, 65);

        // So, we can see here, constructor can allow us
        // to assign different attribute to each object's.



//        System.out.println(human2.name);

        human2.eat();
        human1.drink();

    }
}