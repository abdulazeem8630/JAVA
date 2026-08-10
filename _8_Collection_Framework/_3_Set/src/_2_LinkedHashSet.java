import java.util.LinkedHashSet;
import java.util.Set;

public class _2_LinkedHashSet {
    static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        //add
        set.add(30);
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println(set);
    }
}
