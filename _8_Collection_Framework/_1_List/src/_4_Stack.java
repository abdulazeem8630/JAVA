import java.util.Stack;
import java.util.List;

public class _4_Stack {
    static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //add
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println(stack);

        //pop()
        System.out.println(stack.pop());
        System.out.println(stack);

        //peek()
        System.out.println(stack.peek());

        //empty()
        System.out.println(stack.empty());

        //search()
        System.out.println(stack.search(20)); //last se shuru krta h mtlb top se

        //
    }
}
