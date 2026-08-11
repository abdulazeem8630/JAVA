import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _5_Searching {
    static void main(String[] args) {
        //Collections.binarySearch()
        List<Integer> num = Arrays.asList(10,20,30,40,50);
        int index = Collections.binarySearch(num,30);
        System.out.println(index);
    }
}
