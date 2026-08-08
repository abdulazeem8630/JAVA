class Student{
    String name;
    int age;
    static void study(){
        System.out.println("Studying....");
    }
}
public class _1_Class{
    static void main(String[] args) {
        Student s1 = new Student(); //yahan s1 ek reference variable h ye onject ka ddress or memory location store krta h
        s1.age = 20; //Dot(.) operator object ke member access krta h
        s1.name = "Azeem";
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.study();

        //new Keyword
        //Heap me memory allocate karta hai.
        //Object create karta hai.
        //Constructor call karta hai.
        //Object ka reference return karta hai.

    }
}