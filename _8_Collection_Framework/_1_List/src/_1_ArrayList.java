import java.util.ArrayList;
import java.util.List;

public class _1_ArrayList {
    static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //add()
        names.add("Azeem");
        names.add("Ali");
        names.add("Ahmed");
        System.out.println(names);
        names.add(0,"Abdul");
        System.out.println(names);

        //get()
        System.out.println(names.get(1));

        //set()
        names.set(2,"Wahid");
        System.out.println(names);

        //remove()
        names.remove(3);
        System.out.println(names);

        //remove(Object)
        names.remove(String.valueOf("Wahid"));
        System.out.println(names);

        //size()
        System.out.println(names.size());

        //contains()
        System.out.println(names.contains("Abdul"));

        //indexOf()
        System.out.println(names.indexOf("Azeem"));

        names.add("Azeem");
        names.add("Abdul");
        System.out.println(names);

        //lastIndexOf()
        System.out.println(names.lastIndexOf("Azeem"));

        //isEmpty()
        System.out.println(names.isEmpty());

        //clear()
//        names.clear();
//        System.out.println(names);

        //ArrayList Traversal
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i) + " ");
        }
        System.out.println();
        //Enhanced for
        for (String x : names){
            System.out.print(x + " ");
        }
        System.out.println();
        //forEach()
        names.forEach(x -> System.out.print(x + " "));
        System.out.println();

        //ArrayList with Objects
        List<_1_1_ArrayList_Objects> students = new ArrayList<>();
        students.add(new _1_1_ArrayList_Objects(101,"Abdul"));
        students.add(new _1_1_ArrayList_Objects(102,"Azeem"));
        for (_1_1_ArrayList_Objects student : students){
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}