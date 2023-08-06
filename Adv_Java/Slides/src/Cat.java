public class Cat extends Animal{
    private boolean isPlayful;
    public Cat(String name, int age, String color, boolean isPlayful) {
        super(name, age, color);
        this.isPlayful = isPlayful;
    }

    public boolean isPlayful() {
        return isPlayful;
    }
}
