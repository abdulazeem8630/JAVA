import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student0 {
    String name;
    int marks;
    Student0(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (Marks: " + marks + ")";
    }
}

public class _3_Comparator {
    static void main(String[] args) {
        //Comparator ka use:
        //External/custom ordering define karne ke liye.
        Comparator<Student0> byMarks = (s1,s2)->Integer.compare(s1.marks, s2.marks);
        List<Student0> students = new ArrayList<>();
        students.add(new Student0("Azeem",80));
        students.add(new Student0("Ali",50));
        students.add(new Student0("Ahmad",90));
        Collections.sort(students,byMarks);
        students.forEach((x)-> System.out.println(x));

        //Comparator.comparing()
        students.sort(Comparator.comparing(s -> s.marks));
        //descending
//        students.sort(Comparator.comparing((Student s) -> s.marks).reversed());
    }
}
