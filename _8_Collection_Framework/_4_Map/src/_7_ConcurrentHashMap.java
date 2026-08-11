import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class _7_ConcurrentHashMap {
    static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Azeem");
        map.put(2, "Ali");
        System.out.println(map);
        System.out.println(map.get(1));

        //ConcurrentHashMap me ye methods especially useful hain:
        //putIfAbsent()
        //compute()
        //computeIfAbsent()
        //computeIfPresent()
        //merge()
        //replace()
        //replaceAll()

        //Frequency Counter — DSA me VERY Important
        String s = "banana";
        Map<Character,Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        System.out.println(freq);

        //Same Frequency Problem with merge()
        Map<Character,Integer> freq1 = new HashMap<>();
        for (char ch : s.toCharArray()){
            freq1.merge(ch,1,Integer::sum);
        }
        System.out.println(freq1);
    }
}
