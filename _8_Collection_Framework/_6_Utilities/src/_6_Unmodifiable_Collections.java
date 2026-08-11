import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _6_Unmodifiable_Collections {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));
        List<Integer> readOnly = Collections.unmodifiableList(list);
        System.out.println(list);
        System.out.println(readOnly);

        //Java 9+ Factory Methods
        //List.of(...)
        //List<Integer> list = List.of(10, 20, 30); (Ye ek unmodifiable collection create karta hai.)
        //Set.of(...)
        //Map.of(...)
        //inse bhi unmodifiable hi hote hn
    }
}
