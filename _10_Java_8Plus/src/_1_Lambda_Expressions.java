//Lambda Expressions (Lambda ek short way of writing an implementation of a functional interface method hai)
//traditional code
interface Calculator{
    int add(int a,int b);
}

public class _1_Lambda_Expressions {
    static void main(String[] args) {
        /*
        --> traditional way <--
        Calculator c = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        System.out.println(c.add(10,20));
         */

        // --> With Lambda Expression <--
        Calculator c = (a,b)->a+b;
        System.out.println(c.add(10,15));

    }
}
