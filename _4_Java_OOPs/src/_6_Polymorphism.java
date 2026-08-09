class Calculator{
    //Compile time polymorphism
    //different parameters
    int add(int a, int b){
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;
    }

    //differant type
    void show(int x){
        System.out.println(x + " Integer");
    }
    void show(String name){
        System.out.println(name + " String");
    }

    //Different Order
//    void test(int a,String b)
//    void test(String b,int a)
    //Valid
}

//Runtime polymorphism
class Animal01{
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog01 extends Animal01{
    @Override
    void sound(){
        System.out.println("Dog sound");
    }
}

public class _6_Polymorphism {
    static void main(String[] args) {
        Calculator sum = new Calculator();
        System.out.println(sum.add(2,3));
        System.out.println(sum.add(2,3,4));
        sum.show(1);
        sum.show("Azeem");
        Dog01 dg = new Dog01();
        dg.sound();
        Animal01 an = new Dog01();
        an.sound();
        //Reference kis class ka? Animal ka
        //Object kis class ka?  Dog ka
        //Method kis class ka chala? Dog ka
        //Reason Java runtime par actual object dekhti hai. Isi ko  Dynamic Method Dispatch  kehte hain.

    }
}
