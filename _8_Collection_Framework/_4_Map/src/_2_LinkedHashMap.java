import java.util.LinkedHashMap;
import java.util.Map;

public class _2_LinkedHashMap {
    static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        //add -> put()
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        System.out.println(map);

        //LinkedHashMap Access Order
        //Meaning recently accessed entries order me move ho sakti hain.
        //Ye LRU-cache type designs me useful hota hai.
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>(
                16, 0.75f, true);

    }
}
