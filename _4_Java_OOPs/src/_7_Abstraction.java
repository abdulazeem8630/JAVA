//Abstract class
abstract class Animal02 {
    //concrete method (normal method)
    void eat(){
        System.out.println("Eating...");
    }
    //abstract method
    abstract void sound();
}
class Dog02 extends Animal02{
    @Override
    void sound() {
        System.out.println("Barking....");
    }
}

//Interface
interface Animal03{
    void sound();
    default void eat(){
        System.out.println("Eating by Interface");
    }
}
class Dog03 implements Animal03{
    @Override
    public void sound() {
        System.out.println("Bark by Interface");
    }
    static void show(){
        System.out.println("Hello");
    }
    private void helper(){
        System.out.println("Helper...");
    }
}
public class _7_Abstraction {
    public static void diffAnimal(Animal02 a02){
        a02.eat();
        a02.sound();
    }
    public static void diffAnimal1(Animal03 a03){
        a03.eat();
        a03.sound();
        Dog03.show(); //access by class name bcz of static keyword
    }
    public static void main(String[] args) {
        diffAnimal(new Dog02());
        diffAnimal1(new Dog03());

    }
}
