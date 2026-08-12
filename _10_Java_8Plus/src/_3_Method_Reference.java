/*
--> Method Reference <--
Method Reference lambda ka aur short form hai.
x -> System.out.println(x) <-- lambda me
System.out::println  <-- Method Reference

--> Types of Method References <--
1. Static method
2. Instance method of particular object
3. Instance method of arbitrary object
4. Constructor reference
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

// --> Static method <--
class MathUtil{
    static int square(int x){
        return  x*x;
    }
}

// --> Instance Method Reference <--
class Printer{
    void print(String s){
        System.out.println(s);
    }
}

// --> Arbitrary Object Method Reference <--

// --> Constructor Reference <--
class Student{
    Student(){
        System.out.println("Student Created");
    }
}

// >-- Default Methods in Interface <--
interface Vehicle{
    void start();
    default void stop(){
        System.out.println("Vehicle Stopped");
    }
}
class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Started");
    }
}


public class _3_Method_Reference {
    static void main(String[] args) {
        // --> Static method <--
        Function<Integer,Integer> f = x->MathUtil.square(x); // <-- Lambda
        System.out.println(f.apply(5));
        Function<Integer,Integer> f0 = MathUtil::square; // <-- Method reference
        System.out.println(f0.apply(6));

        // --> Instance Method Reference <--
        Printer p = new Printer();
        Consumer<String> c = s -> p.print(s); // <-- Lambda
        c.accept("Azeem");
        Consumer<String> c0 = p::print; // <-- Method Reference
        c.accept("Abdul");

        // --> Arbitrary Object Method Reference <--
        Function<String,Integer> f1 = String::length; // <-- Method Reference
        System.out.println(f1.apply("Azeem")); //<-- 5 length of string

        // --> Constructor Reference <--
        Supplier<Student> s = () -> new Student(); //<-- Lambda
        s.get();
        Supplier<Student> s0 = Student::new; //<-- Method reference
        s.get();

        // >-- Default Methods in Interface <--
        Car c1 = new Car();
        c1.start();
        c1.stop();
    }
}
