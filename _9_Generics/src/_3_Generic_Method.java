//Generic method mein method khud type parameter define karta hai.
class Test{
    public static <T> void print(T value) {
        System.out.println(value);
    }

    //Generic Method with Return Value
    public static <B> B getValues(B values){
        return values;
    }

    //Generic Method with Multiple Types
    public static <K, V> void printPair(K key, V value) {
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}

public class _3_Generic_Method {
    static void main(String[] args) {
        Test.print(10);
        Test.print("Hello");
        Test.print(10.5);

        //return
        Integer x = Test.getValues(100);
        String y = Test.getValues("Azeem");
        Double z = Test.getValues(11.5);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        //multiple generics
        Test.printPair(101, "Java");
        Test.printPair("Name", "Azeem");
        Test.printPair("Price", 99.99);
    }
}
