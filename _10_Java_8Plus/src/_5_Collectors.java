/*
 Collectors
 Collectors utility class stream results ko different forms mein collect karne ke liye use hoti hai.

 --> Important methods <--
toList()
toSet()   --> Duplicates automatically remove ho jayenge.
toMap()
joining()  --> Strings combine karna:
groupingBy()
partitioningBy()
counting()
summingInt()
averagingInt()
mapping()
collectingAndThen()
 */


import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
class Student00{
    String name;
    String city;

    Student00(String name, String city){
        this.name = name;
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}

public class _5_Collectors {
    static void main(String[] args) {
        //toSet()
        List<Integer> nums = List.of(10,20,40,30,60,50);
        Set<Integer> result =
                nums.stream()
                        .collect(Collectors.toSet());
        System.out.println(result);

        //joining()
        List<String> names = List.of("Azeem", "Rahul", "Aman");
        String result1 =
                names.stream()
                        .collect(Collectors.joining(", "));
        System.out.println(result1);



    }
}
