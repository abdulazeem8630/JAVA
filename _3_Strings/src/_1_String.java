public class _1_String {
    public static void main(String[] args){
        //String create method 1
        String s1 = "Hello";
        System.out.println("Method 1 : " + s1);

        //Method 2
        String s2 = new String("Hello");
        System.out.println("Method 2 : " + s2);

        //String pool  (Ye Java ka special memory area hai. Purposen Duplicate Strings ko avoid karna. Memory bachana.)
        String a1 = "Java"; //Sirf ek hi String Object banega.
        String a2 = "Java"; //Dono same object ko point kar rahe hain.
        //Isi ko String Pool kehte hain.

        //equals()
        String s3 = new String("Java");
        String s4 = new String("Java");
        System.out.println(s3.equals(s4));
        //Content compare karta hai.

        //equalsIgnoreCase()
        String str1 = "JAVA";
        String str2 = "java";
        System.out.println(str1.equalsIgnoreCase(str2));


        //String immutable
        //wrong way
        String s = "Hello";
        s.concat(" World");
        System.out.println(s);
        //output : Hello (kyunki string immutable hai)

        //right way
        String st = "Hello";
        st = st.concat(" World");
        System.out.println(st);
        //output : Hello World (kyunki Old String change nahi hui. Java ne naya object banaya.)


    }
}