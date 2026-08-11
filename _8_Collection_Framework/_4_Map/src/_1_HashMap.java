import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _1_HashMap {
    static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //add/update put()
        map.put(2,"Azeem");
        map.put(3,"Ali");
        map.put(1,"Ahmad");
        System.out.println(map);

        //get() key ke through value
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));
        System.out.println(map.get(4)); //null agr key nhi h to

        //containsKey()  Check karta hai key exist karti hai ya nahi.
        System.out.println(map.containsKey(1));
        //containsValue()  Check karta hai Value exist karti hai ya nahi.
        System.out.println(map.containsValue("Abdul"));

        //remove() key ke basis par entry remove
        System.out.println(map.remove(2));
        System.out.println(map);

        //size()
        System.out.println(map.size());

        //isEmpty()
        System.out.println(map.isEmpty());

        //clear()
//        map.clear();
//        System.out.println(map);

        //keySet()
        Set<Integer> keys = map.keySet();
        System.out.println(keys);

        //values()
        Collection<String> values = map.values();
        System.out.println(values);

        //entrySet()
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        System.out.println(entries);

        //Traversal
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //foreach()
        map.forEach((key,value)-> System.out.println(key + " -> " + value));

        //putIfAbsent()  Agar key already exist nahi karti tabhi put karega.
        map.putIfAbsent(2,"Ali");
        System.out.println(map);

        //getOrDefault()
        System.out.println(map.getOrDefault(100,"Nahi mila"));

        //replace()
        map.replace(1,"New Azeem");
        System.out.println(map);

        //replaceAll()
        map.replaceAll((key, value) -> value.toUpperCase());
        System.out.println(map);

        //compute()  Existing key ke value ko calculate/update karne ke liye.
        map.compute(1, (key, value) -> value + " Khan");
        System.out.println(map);
        //computeIfAbsent()  Agar key absent ho to value calculate:
        map.computeIfAbsent(10,key->"Student" + key);
        System.out.println(map);
        //computeIfPresent()  Agar key present ho tab calculation:
        map.computeIfPresent(10, (key, value) -> value + " Updated");
        System.out.println(map);

        //merge()  Existing value ke saath combine karne ke liye.
        //Example frequency counting:
        Map<String ,Integer> freq = new HashMap<>();
        freq.merge("Java", 1,Integer::sum);
        System.out.println(freq);
    }
}