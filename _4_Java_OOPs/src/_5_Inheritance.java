class Animal1{
    Animal1(){  //constructor calling...
        System.out.println("Animal...");
    }
    void eat(){
        System.out.println("Eating...");
    }
    void say(){
        System.out.println("Animal Say....");
    }
}
class Dog1 extends Animal1{
    Dog1(){ //constructor calling...
        System.out.println("Dog...");
    }
    void bark(){
        System.out.println("Barking...");
    }
    @Override
    void say(){
        super.say();
        System.out.println("Dog Say....");
    }
}

//multilevel inheritance
class Cat extends Dog1{
    void meow(){
        System.out.println("Meow....");
    }
}

//Variable hiding
class Parent2{
    int x=10;
}
class Child2 extends Parent2{
    int x=20;
    void show(){
        System.out.println(x);
        System.out.println(super.x);
    }
}

public class _5_Inheritance {
    static void main(String[] args) {
        Dog1 d = new Dog1();
        d.eat();
        d.bark();
        Cat c = new Cat();
        c.meow();
        Child2 cd = new Child2();
        cd.show();
        Animal1 up = new Dog1(); //upcasting
        System.out.println(up instanceof Dog1); //instanceof (Check karta hai object kis class ka hai.)
        Dog1 d1 = (Dog1)up; //downcasting
        d1.say();
        d1.eat();
        d1.bark();

    }
}
