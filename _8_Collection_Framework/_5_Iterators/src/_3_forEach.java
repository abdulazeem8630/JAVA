import java.util.*;

public class _3_forEach {
    static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30);
        numbers.forEach(x-> System.out.println(x));
        //or sort
        numbers.forEach(
                System.out::println
        );
        List<String> names = Arrays.asList("Azeem", "Ali", "Ahmed");
        names.forEach(
                System.out::println
        );

        //map
        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Azeem");
        students.put(102, "Ali");
        students.forEach((id, name) ->
                System.out.println(
                        id + " → " + name)
        );

        //set
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30));
        set.forEach(
                System.out::println
        );
    }
}
