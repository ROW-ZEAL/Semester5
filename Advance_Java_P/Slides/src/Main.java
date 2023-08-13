public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rocky", 3, "White", "Lab Mix");
        System.out.println(dog1.getName());
        System.out.println(dog1.makeSound());
        Dog dog2 = new Dog("Doge", 4, "Red");
        Cat cat1 = new Cat("Max", 9, "Brown", false);
        System.out.println(cat1.getName());
        System.out.println(cat1.makeSound());

    }

}
