import java.util.regex.*;

public class _5_String_formatting_Regex {
    static void main(String[] args) {
        //Part A : String Formatting
        //without formating
        int age = 20;
        double salary = 12345.6789;
        System.out.println(age); //20
        System.out.println(salary);  //12345.6789
        //with formatting
        System.out.printf("Age = %d Salary = %.2f", age,salary);

        System.out.println();
        //printf()  Ye C Language ke printf() jaisa hi hai.
        String name = "Azeem";
        System.out.printf("%s is %d years old", name, age);

        System.out.println();
        //String.format()
        //Difference
        //printf() Direct print karta hai.
        //String.format() String return karta hai.
        String result = String.format("%s scored %d marks", "Azeem", 95);
        System.out.println(result);

        System.out.println();
        //Format Specifiers
        //%d (Integer)
        System.out.printf("%d",100);
        System.out.println();
        //%f  (Float / Double)
        System.out.printf("%.2f",12.56789);
        System.out.println();
        //%s (String)
        System.out.printf("%s","Java");
        System.out.println();
        //%c (Character)
        System.out.printf("%c",'A');
        System.out.println();
        //%b (boolean)
        System.out.printf("%b",true);
        System.out.println();
        //%x (hexadecimal)
        System.out.printf("%x",15);
        System.out.println();
        //%o (octal)
        System.out.printf("%o",15);
        System.out.println();
        //width
        System.out.printf("%10s","Java"); //minimum width 10
        System.out.println();
        //Left alignment
        System.out.printf("%-10s","Java"); //baki spaces right side me
        System.out.println();
        //Zero Padding
        System.out.printf("%05d",25);
        System.out.println();
        //precision
        System.out.printf("%.3f",12.34567);
        System.out.println();
        //print (%)
        System.out.printf("Discount = 20%%");
        System.out.println();


        //Escape Sequences   Special Characters ko represent karte hain.
        // \n New line
        System.out.println("Java\nPython");
        // \t Tab
        System.out.println("Java\tPython");
        // \ Backslash
        System.out.println("\\");
        // " Double quote
        System.out.println("\"Java\"");
        // ' Single quote
        System.out.println("\'");
        // \r Carriage Return . Cursor ko line ke beginning me le jata hai.
        System.out.println("Hello\rJava");
        // \b  Backspace
        System.out.println("ABC\bD");




        //REGEX = Regular Expression (ye ek pattern hota h)
        //matches()
        String email = "abc@gmail.com";
        System.out.println(email.matches(".+"));

        //Pattern Class  Regex compile karta hai.
        Pattern pattern = Pattern.compile("\\d+");
        //Matcher Class  Match perform karta hai.
        Matcher matcher = pattern.matcher("12345");

        //matches()
        System.out.println(matcher.matches());
        //find()  Text ke andar search karta hai.
        Pattern p = Pattern.compile("Java");
        Matcher m = p.matcher("I Love Java");
        System.out.println(m.find());
        //group()  Matched text return karta hai.
    }
}
