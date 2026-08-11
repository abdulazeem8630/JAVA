//Bounded Type Parameters
//Kabhi-kabhi tum nahi chahte ki T koi bhi type ho.
class Test1{
    public static <T extends Number> void print(T value){
        System.out.println(value);
    }
}

public class _2_Type_parameters {
    static void main(String[] args) {
        //Generic mein jo letters use karte hain unhe Type Parameters kehte hain.
        //Parameter	Meaning
        //   T	     Type
        //   E	     Element
        //   K	     Key
        //   V	     Value
        //   N	     Number
        //   S	     Type
        //   U	     Type
        //   R	     Return type

        Test1.print(10);
        Test1.print(10.5);
        Test1.print(10.5f);
    }
}
