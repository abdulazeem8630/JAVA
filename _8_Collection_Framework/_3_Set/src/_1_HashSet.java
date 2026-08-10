import java.util.HashSet;
import java.util.Set;

public class _1_HashSet {
    static void main(String[] args) {
        Set<Integer> num = new HashSet<>();
        //add
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        System.out.println(num);
        Integer x =100;
        Integer x1 =200;
        Integer x2 =350;
        System.out.println(x.hashCode());
        System.out.println(x1.hashCode());
        System.out.println(x2.hashCode());

        //HashSet Common Methods
        //add()
        //remove()
        //contains()
        //size()
        //isEmpty()
        //clear()
    }
}
