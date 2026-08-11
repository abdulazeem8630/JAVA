import java.util.*;

public class _1_Collections_class {
    static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(50, 10,50,5,10,30, 80, 10));
        Collections.sort(num);
        System.out.println(num);

        //Important Collections Methods
        //sort()
        //binarySearch()
        //reverse()
        //shuffle()
        //frequency()
        //max()
        //min()
        //swap()
        //fill()
        //copy()
        //rotate()
        //replaceAll()
        //disjoint()
        //unmodifiableList()
        //unmodifiableSet()
        //unmodifiableMap()

        //shuffle
        Collections.shuffle(num);
        System.out.println(num);
        //Shuffle with Random
        Random random = new Random(10);
        Collections.shuffle(num, random);
        System.out.println(num);


        Collections.sort(num);
        System.out.println(num);
        //reverse
        Collections.reverse(num);
        System.out.println(num);

        //Frequency
        System.out.println("Original: " + num);
        int count = Collections.frequency(num,10);
        System.out.println(count);
        //har element ki frequency
        Map<Integer,Integer> freq = new HashMap<>();
        for (Integer x : num){
            freq.put(x, freq.getOrDefault(x,0)+1);
        }
        freq.forEach((key,value)-> System.out.println(key + " : " + value));

    }
}