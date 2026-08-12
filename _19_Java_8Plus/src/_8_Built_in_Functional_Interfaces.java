import java.util.List;
import java.util.function.*;

/*
1.Predicate (Ek input leta hai aur boolean return karta hai)

2.Function  (Ek input leta hai aur output return karta hai)

3.Consumer (Input leta hai, kuch operation karta hai, return kuch nahi karta)

4.Supplier (Input nahi leta, output provide karta hai)

5.BiFunction (2 inputs leta hai aur 1 output deta hai)

6.BinaryOperator (BinaryOperator BiFunction ka specialized form hai)

7.UnaryOperator (UnaryOperator ek input leta hai aur same type ka output deta hai)

 */

//example
class Employee {
    String name;
    double salary;
    String department;
    Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
}

public class _8_Built_in_Functional_Interfaces {
    static void main(String[] args) {
        // --> Predicate <--
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10));
        //Predicate Composition --> Predicates combine kar sakte ho.
        Predicate<Integer> positive = n -> n > 0;
        Predicate<Integer> positiveEven = positive.and(isEven);
        System.out.println(positiveEven.test(11));
        //for not
        Predicate<Integer> notPositive = positive.negate();

        // --> Function <--
        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(5));
        //Function Composition
        Function<Integer, Integer> doubleValue = n -> n * 2;
        Function<Integer, Integer> addTen = n -> n + 10;
        Function<Integer,Integer> result = doubleValue.andThen(addTen);
        System.out.println(result.apply(10));
        //compose() reverse order mein apply karta hai.

        // --> Consumer <--
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Azeem");
        //forEach ka consumer argument hota hai.

        // --> Supplier <--
        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());

        // --> BiFunction <--
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(10,20));

        // --> BinaryOperator <-- only for same both input and output type
        BinaryOperator<Integer> add1 = (a, b) -> a + b;
        System.out.println(add1.apply(20,50));

        // --> UnaryOperator <--
        UnaryOperator<Integer> cube = n -> n * n * n;
        System.out.println(cube.apply(3));

        //Example
        List<Employee> employees = List.of(
                new Employee("A", 50000, "IT"),
                new Employee("B", 70000, "HR"),
                new Employee("C", 80000, "IT"),
                new Employee("D", 40000, "Sales")
        );

        employees.stream()
                .filter(e->e.getDepartment().equals("IT"))
                .forEach(e->System.out.println(e.getName()));
        employees.stream()
                .filter(e->e.getSalary()>60000)
                .map(Employee::getName)
                .forEach(System.out::println);
        double average = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println(average);

    }
}
