// --> Functional Interface <--
@FunctionalInterface
interface Calculator0{
    int add(int a,int b);
}
/*
Functional Interface mein Default/Static Methods
Functional Interface mein:
1 abstract method hona chahiye.
Lekin default aur static methods allowed hain.
 */
@FunctionalInterface
interface Test {
    void show();
    default void hello() {
        System.out.println("Hello");
    }
    static void message() {
        System.out.println("Message");
    }
} //ye valid hai

/*
--> Built-in Functional Interfaces <--
Predicate
Function
Consumer
Supplier
BiFunction
BinaryOperator
UnaryOperator
Ye java.util.function package mein hain.
 */

public class _2_Functional_Interface {
    static void main(String[] args) {
        Calculator c = (a,b)->a+b;
        System.out.println(c.add(20,22));
    }
}
