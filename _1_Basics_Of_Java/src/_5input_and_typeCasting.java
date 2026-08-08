import java.util.Scanner;

public class _5input_and_typeCasting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("Enter your number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);

        //type casting double to int
        double a = 10.1;
        int b = (int)a;
        System.out.println(b);


    }
}
