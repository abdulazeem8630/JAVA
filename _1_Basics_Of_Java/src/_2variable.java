
public class _2variable {

    static int b;
    int c;
    public static void main(String[] args){


        //Local variable
        int a = 10;
        System.out.println(a);


        // Static variable
        b = 200;
        System.out.println(b);


        // Instance Variable
        _2variable s1 = new _2variable();
        s1.c = 20;
        System.out.println(s1.c);
    }
}