import java.util.List;

public class _4_Uppar_Bound {
    public static double sum(List<? extends Number>list){
        double sum = 0;
        for (Number n : list){
            sum += n.doubleValue();
        }
        return sum;
    }
    static void main(String[] args) {
        List<Integer> nums = List.of(10, 20, 30);
        System.out.println(sum(nums));
        List<Double> nums1 = List.of(10.5, 20.5);
        System.out.println(sum(nums1));
    }
}
