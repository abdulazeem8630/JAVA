import java.util.List;

public class _6_Wildcard {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    static void main(String[] args) {
        List<String> names = List.of("A", "B", "C");
        List<Integer> nums = List.of(10, 20, 30);
        printList(names);
        printList(nums);
    }
}
