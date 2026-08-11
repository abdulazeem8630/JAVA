import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class _5_WeakHashMap {
    static void main(String[] args) {
        WeakHashMap<Object,String> map = new WeakHashMap<>();
        Object key = new Object();
        map.put(key,"Some Data");
        System.out.println(map);
        key = null;
        System.gc(); //gc garbage collector
        System.out.println(map);
    }
}
