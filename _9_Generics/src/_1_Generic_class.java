//Generic class (Generic class woh class hoti hai jo type parameter accept karti hai)
class Box<T>{
    T value;
    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}

//Multiple Type Parameters (Ek generic class mein multiple type parameters ho sakte hain)
class Pair<K, V> {
    K key;
    V value;
    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    void display() {
        System.out.println(key);
        System.out.println(value);
    }
}

public class _1_Generic_class {
    static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.setValue(100);
        System.out.println(box1.getValue());

        Pair<Integer,String> p1 = new Pair<>(101,"Azeem");
        p1.display();
    }
}