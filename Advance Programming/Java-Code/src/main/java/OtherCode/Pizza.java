package OtherCode;

public class Pizza {

    // Part ho overloaded_constructor.java ko

    String bread;
    String sauce;
    String cheese;
    String topping;


    // constructor
    Pizza(String bread, String sauce, String cheese, String topping){

        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;

    }

    Pizza(){

        // empty
        // NOTE: yedi parameter kunai ko deyeko choina vaney
        // tesko outupt NULL value dekhau cha....


    }



    // 2 have only 2 parameter access

    Pizza (String bread, String sauce){
        this.bread = bread;
        this.sauce = sauce;
    }
    // 2 have only 1 parameter
    Pizza (String bread){
        this.bread = bread;
    }




}
