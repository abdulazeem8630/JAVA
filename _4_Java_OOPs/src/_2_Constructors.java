class Student1 {
    Student1() {
        System.out.println("Constructor Called");
    }
}

//Parameterized Constructor
class cons1{
    String name;
    int age;
    cons1(String n,int a){
        name = n;
        age = a;
    }
}

//Constructor Overloading
class Student2{
    Student2(){
        System.out.println("Default");
    }
    Student2(String name){
        System.out.println(name);
    }
}

//this Keyword
class Student3{
    String name;
    Student3(String name){
        this.name = name; //name = name; me dono name local variable ko refer karenge.
        //this.name  Object ka variable.
    }
}

//this()
//Ek constructor se dusre constructor ko call karta hai.
class Student4{
    Student4(){
        this("Azeem");
        System.out.println("Default");
    }
    Student4(String name){
        System.out.println(name);
    }
}

//super()
//Parent class ka constructor call karta hai.
class Animal{
    Animal(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    Dog(){
        System.out.println("Dog");
    }
}

//Copy Constructor (Java Style)
class Student5{
    String name;
    Student5(){}
    Student5(Student5 s){
        this.name = s.name;
    }
}

//Private Constructor Purpose: Object creation ko restrict karna.
//Use Cases : Singleton Pattern  :Utility Classes
class Demo{
    private Demo(){
    }
}
public class _2_Constructors {
    public static void main(String[] args) {
        Student1 s = new Student1();
        cons1 s1 = new cons1("Azeem",20);
        System.out.println(s1.name);
        System.out.println(s1.age);
        Student2 s0 = new Student2();
        Student2 s2 = new Student2("Azeem");
        Student3 s3 = new Student3("Azeem");
        System.out.println(s3.name);
        Student4 s4 = new Student4();
        Dog d = new Dog();

        //copy constructor usage
        Student5 s5 = new Student5();
        s5.name = "Azeem";
        Student5 s6 = new Student5(s5);
        System.out.println(s6.name);
    }
}
