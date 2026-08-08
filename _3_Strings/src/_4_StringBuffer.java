public class _4_StringBuffer {
    static void main(String[] args) {
        //StringBuffer bhi mutable class hai. Difference? Ye Thread Safe hai.
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        //Thread Safety
        //Suppose (2 Threads same object ko modify kar rahe hain.Without Protection)
        //Thread 1
        //↓
        //Java
        //Thread 2
        //↓
        //Programming
        //↓
        //Output
        //JaProgramming (Data corrupt ho sakta hai.)
        //StringBuffer  (Synchronization use karta hai. Isliye safe hai.)
    }
}
