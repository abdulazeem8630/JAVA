import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class _3_TreeMap {
    static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        //ye ascending order me keys ko sort kr deta h
        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");
        System.out.println(map);

        //TreeMap Comparator agr decreasing order me chahiye to
        TreeMap<Integer,String> tmap = new TreeMap<>(Collections.reverseOrder());
        tmap.put(30, "C");
        tmap.put(10, "A");
        tmap.put(20, "B");
        System.out.println(tmap);

        //TreeMap Navigation (reeMap ke paas TreeSet jaise navigation methods hote hain)
        //lowerKey()
        //floorKey()
        //ceilingKey()
        //higherKey()
        //firstKey()
        //lastKey()
    }
}
