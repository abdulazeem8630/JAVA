import java.util.IdentityHashMap;

public class _6_IdentityHashMap {
    static void main(String[] args) {
        IdentityHashMap<String,Integer> map = new IdentityHashMap<>();
        String a = new String("Java");
        String b = new String("Java");
        map.put(a,1);
        map.put(b,2);
        System.out.println(map);
        System.out.println(a==b);
    }
}
