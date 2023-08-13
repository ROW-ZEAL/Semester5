public class Dog extends Animal{
    private String breedName;
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }
    public Dog(String name, int age, String color, String breedName) {
        super(name, age, color);
        this.breedName = breedName;
    }



    public String getBreedName() {
        return breedName;
    }

    @Override
    public String makeSound(){
        return "Bark";
    }
}
