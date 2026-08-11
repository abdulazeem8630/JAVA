import java.util.*;

public class _1_Iterator {
    static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){ //Kya next element available hai?
            Integer value = iterator.next(); //Next element return karta hai:
            //Iterator ka ek bahut important feature hai:
            //Iteration ke during safely element remove kar sakte ho using Iterator.remove()
            if (value==40 || value==60){
                iterator.remove();
            }
        }
        System.out.println(numbers);
        //Iterator -> same set , hashset ke liye bhi
        //map me directly nhi but
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Azeem");
        map.put(2, "Ali");
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}