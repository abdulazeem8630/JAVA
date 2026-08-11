import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class _2_ListIterator {
    static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));
        ListIterator<Integer> it = numbers.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());//forward
        }
        while (it.hasPrevious()){
            System.out.println(it.previous());//backward
        }

        //ListIterator Methods
        //hasNext()
        //next()
        //hasPrevious()
        //previous()
        //nextIndex()
        //previousIndex()
        //add()
        //remove()
        //set()
    }
}
