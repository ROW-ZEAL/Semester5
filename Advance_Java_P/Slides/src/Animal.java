public class Animal {
    private String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String makeSound(){
        return "Meow";
    }

    public String getAllDetails(){
        String details = "Name: " + name + " Age :" + age + " Color: " + color;
        return details;
    }
}
