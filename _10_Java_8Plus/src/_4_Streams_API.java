import java.util.List;
import java.util.Optional;

/*
//Stream Source
 --> Collection <--
1.List --> list.stream();
2.Set --> set.stream();
3.Array --> Arrays.stream(array);
-->Values -->Stream.of(1, 2, 3);

--> Intermediate Operations <--
filter          --> Condition ke according elements select karta hai.
map             --> Har element ko transform karta hai.
mapToInt
mapToLong
mapToDouble
flatMap         --> flatMap() nested structures ko flatten karne ke liye extremely useful hai.
distinct        --> Duplicate elements remove karta hai.
sorted          --> Default Ascending sorting: // Descending: --> sorted(Comparator.reverseOrder())
limit           --> Sirf first N elements:
skip            --> Starting ke N elements skip:
peek

--> Terminal Operations <--
forEach
collect
toList
count
reduce
min
max
findFirst
findAny
anyMatch
allMatch
noneMatch
 */

public class _4_Streams_API {
    static void main(String[] args) {
        // --> Stream API <--
        List<Integer> nums = List.of(10,20,40,15,25);
        //Traditional way
        for (Integer n : nums){
            if (n>20){
                System.out.println(n);
            }
        }
        //BY Stream
        nums.stream()
                .filter(n->n>20) //filter --> Condition ke according elements select karta hai.
                .forEach(System.out::println);
        //another example
        nums.stream()
                .filter(n->n>10)
                .map(n->n*2) //Map --> Har element ko transform karta hai
                .forEach(System.out::println);


        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        System.out.println(min.get());
        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        System.out.println(max.get());

        //reduce
        int sum = nums.stream().reduce(0,Integer::sum);
        System.out.println(sum);

        //collect Stream result ko collection ya kisi other structure mein collect karta hai.
        List<Integer> result =
                nums.stream()
                        .filter(n->n>20)
                        .toList();
        System.out.println(result);
    }
}
