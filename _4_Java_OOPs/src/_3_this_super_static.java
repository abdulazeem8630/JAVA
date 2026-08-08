//this keyword
class Students {
    String name;
    Students(String name) {
        this.name = name;
    }
    //this Reference
    void display() {
        System.out.println(this);
    }
    //Passing this (Kabhi-kabhi current object ko kisi dusre method me bhejna hota hai.)
    void show(Students s) {
        System.out.println("Received");
    }
    void display1() {
        show(this);
    }

    //Returning this (Method current object return kar sakta hai.)
    Students getObject() {
        return this;
    }
}

//super keyword
class Animal0 {
    String type = "Animal";
}
class Dog0 extends Animal0 {
    void display() {
        System.out.println(super.type);
    }
}
//super Variable Access
class Parent {
    int x = 10;
}
class Child extends Parent {
    int x = 20;
    void show() {
        System.out.println(x);
        System.out.println(super.x);
    }
}

//super Method
class Parent1 {
    void show() {
        System.out.println("Parent");
    }
}
class Child1 extends Parent1 {
    void show() {
        super.show();
        System.out.println("Child");
    }
}

//Static Variable
class Student0 {
    static String college = "ABC";
}

//Static Method
class Demo0 {
    static void greet() {
        System.out.println("Hello");
    }
}

//Static Block (Class load hote hi execute hota hai.)
class Demo1 {
    static {
        System.out.println("Static Block");
    }
}

//Instance Initialization Block (Ye har object banne par execute hota hai.)
class Demo2 {
    {
        System.out.println("Instance Block");
    }
    Demo2() {
        System.out.println("Constructor");
    }
}

public class _3_this_super_static {
    static void main(String[] args) {
        Students s = new Students("Azeem");
        System.out.println(s.name);
        System.out.println(s);
        s.display();
        s.display1();
        Students s1 = s.getObject();
        System.out.println(s1.name);
        Dog0 d1 = new Dog0();
        d1.display();
        Child c = new Child();
        c.show();
        Child1 c1 = new Child1();
        c1.show();
        Student0 s0 = new Student0();
        Student0 s2 = new Student0();
        System.out.println(Student0.college);
        Demo0.greet(); //call without object create no need
        Demo1 d = new Demo1();
        Demo2 d2 = new Demo2();
    }
}
