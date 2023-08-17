package OtherCode;

public class OverloadedMethod {
//    Overloaded method are that which
//    share the same name but have
//            different parameters.

//    each method need to have
//    diff. parameters to have unique method signature.

    public static void main(String[] args) {
        int x = add(10,20);
        System.out.println(x);

//        int y = add(10,20,30);
//        System.out.println(y);
//
//        int z = add(10,20,30, 40);
//        System.out.println(z);

    }


public static int add(int a, int b){
    System.out.println("This is overloaded method #1.");
    return a+b;

}

public static int add(int a, int b, int c){
    System.out.println("This is overloaded method #2.");
        return a + b+ c;

}
public static int add(int a, int b, int c, int d){
    System.out.println("This is overloaded method #3.");

        return a + b+ c+d;

    }


}
