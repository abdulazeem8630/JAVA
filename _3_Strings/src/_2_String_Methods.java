import java.util.Arrays;

public class _2_String_Methods {
    static void main(String[] args) {
        String str = "Java Programming";
        //length()  String ki total length return karta hai.
        System.out.println(str.length()); //16

        //charAt()  Kisi index ka character return karta hai.
        System.out.println(str.charAt(0)); //J

        //substring()  String ka ek part return karta hai.
        //Single Parameter
        System.out.println(str.substring(5)); //Programming
        //Two Parameters
        System.out.println(str.substring(0,4)); //Java

        //contains()  Check karta hai string ke andar dusri string hai ya nahi.
        System.out.println(str.contains("Java")); //true agr not found to false

        //indexOf()  Pehli occurrence return karta hai.
        System.out.println(str.indexOf('a')); //1 agr not found to -1

        //lastIndexOf()  Last occurrence return karta hai.
        System.out.println(str.lastIndexOf('a')); //10

        //startsWith()
        System.out.println(str.startsWith("Java")); //true

        //endsWith()
        System.out.println(str.endsWith("ming")); //true

        //toUpperCase()
        System.out.println(str.toUpperCase()); //JAVA PROGRAMMING

        //toLowerCase()
        System.out.println(str.toLowerCase()); //java programming

        //trim()  Beginning aur ending ke spaces remove karta hai.
        String str1="   Java   ";
        System.out.println(str1.trim()); //Java

        //strip()  Unicode spaces bhi remove karta hai.
        System.out.println(str.strip()); //Java Programming

        //replace()  simple replacement
        System.out.println(str.replace('a','o'));//Jovo Progromming
        System.out.println(str.replace("Java","Python"));//Python Programming

        //replaceFirst()  Sirf first occurrence replace karta hai.
        System.out.println(str.replaceFirst("a","o")); //Jova Programming

        //replaceAll()  Saari occurrences replace karta hai.
        System.out.println(str.replaceAll("a","o")); //Jovo Progromming

        //split()  String ko parts me divide karta hai.
        String str2="Java,Python,C++";
        String[] arr=str2.split(",");
        System.out.println(Arrays.toString(arr)); //[Java, Python, C++]

        //concat()  String join karta hai.
        String a="Hello";
        String b="Java";
        System.out.println(a.concat(b)); // Hello Java

        //isEmpty()  Length zero hai ya nahi.
        System.out.println(str.isEmpty()); //false
        String s="";
        System.out.println(s.isEmpty()); //true

        //isBlank()  Java 11+  Sirf spaces bhi blank hote hain.
        String s1="   ";
        System.out.println(s1.isBlank()); //true

        //repeat()  Java 11+
        System.out.println("Hi".repeat(3));

        //compareTo()
        System.out.println("Apple".compareTo("Banana"));
        //Negative → First string chhoti hai (lexicographically)
        //Positive → First string badi hai
        //Zero → Dono equal hain

        //compareToIgnoreCase()  Case ignore karta hai.
        System.out.println("JAVA".compareToIgnoreCase("java"));

        //intern()  Ye String ko String Pool me return karta hai.
        String x1 = new String("Java");
        String x2 = x1.intern();
        String x3 = "Java";
        System.out.println(x2 == x3); //true
    }
}
