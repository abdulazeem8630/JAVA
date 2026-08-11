import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Comparable Simple Example
class Student implements Comparable<Student> {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }

    //    @Override
//    public int compareTo(Student other){
//        return this.marks - other.marks;
//    }
    //Comparable with Sorting
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return String.valueOf(marks);
    }
}

public class _2_Comparable {
    static void main(String[] args) {
        //compareTo()
        Integer a =10;
        Integer b =20;
        Integer c =20;
        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(a));
        System.out.println(b.compareTo(c));

        List<Student> students = new ArrayList<>();
        students.add(new Student(80));
        students.add(new Student(50));
        students.add(new Student(90));
        Collections.sort(students);
        System.out.println(students);
    }
}
