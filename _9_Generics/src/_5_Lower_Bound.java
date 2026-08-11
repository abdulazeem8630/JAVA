import java.util.ArrayList;
import java.util.List;

public class _5_Lower_Bound {
    public static void addNum(List<? super Integer>list){
        list.add(10);
        list.add(20);
        list.add(30);
    }
    static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Number> b = new ArrayList<>();
        List<Object> c = new ArrayList<>();
        addNum(a);
        addNum(b);
        addNum(c);
    }
}
