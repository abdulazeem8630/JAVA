interface Container<T>{
    void set(T value);
    T get();
}
class Box1 implements Container<String>{
    private String value;

    public void set(String value) {
        this.value = value;
    }

    public String get() {
        return value;
    }
}

//Generic Constructor (Class generic na ho tab bhi constructor generic ho sakta hai)
class Test0 {
    <T> Test0(T value) {
        System.out.println(value);
    }
}


public class _7_Generic_Interface {
    static void main(String[] args) {
        Test0 t1 = new Test0(100);
        Test0 t2 = new Test0("Hello");
    }
}
