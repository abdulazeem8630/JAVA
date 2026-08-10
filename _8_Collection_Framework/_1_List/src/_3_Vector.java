import java.util.Vector;
import java.util.List;

public class _3_Vector {
    static void main(String[] args) {
        Vector<Integer> num = new Vector<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        System.out.println(num);
        System.out.println(num.capacity());
        System.out.println(num.size());
    }
}
