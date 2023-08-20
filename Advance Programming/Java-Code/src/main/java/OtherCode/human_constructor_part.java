package OtherCode;

public class human_constructor_part {

    String name;
    int age;
    double weight;

    human_constructor_part(String name, int age, double weight ){
        // constructor is created...

        this.name = name;
        this.age = age;
        this.weight = weight;


    }

    void eat(){
        System.out.println(this.name + " is eating.");
    }
    void drink(){
        System.out.println(this.name + " is drinking.");
    }
}
