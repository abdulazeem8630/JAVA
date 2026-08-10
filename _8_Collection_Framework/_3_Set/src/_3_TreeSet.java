import java.util.Set;
import java.util.TreeSet;

public class _3_TreeSet {
    static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        //TreeSet (TreeSet unique elements ko sorted order me maintain karta hai.)
        //add
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);
        //String with TreeSet
        TreeSet<String> names = new TreeSet<>();
        //add
        names.add("Z");
        names.add("A");
        names.add("M");
        names.add("B");
        System.out.println(names);

        //first()
        System.out.println(names.first());
        //last()
        System.out.println(names.last());

        TreeSet<Integer> set = new TreeSet<>(numbers);
        //lower()  Given element se strictly smaller the greatest element.
        System.out.println(set.lower(30));
        //lower()  Given element se strictly greatest  the smaller element.
        System.out.println(set.higher(20));
        //floor()  Given value se less than or equal greatest element.
        System.out.println(set.floor(35));
        //ceiling() Given value se greater than or equal smallest element.
        System.out.println(set.ceiling(15));

        //Comment methods
        //pollFirst()
        //pollLast()

    }
}
