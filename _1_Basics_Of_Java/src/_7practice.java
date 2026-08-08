import java.util.Scanner;

public class _7practice {
    public static void main(String[] args){


        //1. even or odd number
        int i=21;
        if (i%2==0){
            System.out.println(i + " is Even number");
        }else {
            System.out.println(i + " is odd number");
        }

        //largest of three number
        int a = 2, b = 6, c = 30;
        if (a>=b && a>=c){
            System.out.println("The largest number is " + a);
        } else if (b>=a && b>=c){
            System.out.println("The largest number is " + b);
        }else {
            System.out.println("The largest number is " + c);
        }

        //sum of n number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int sum = 0;
        for (int j=0;j<size;j++){
            sum += sc.nextInt();
        }System.out.println("The sum of these " + size +" number is = " + sum);

        //factorial
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the factorial number");
        int factorial = sc1.nextInt();
        int num = 1;
        if (factorial==0){
            System.out.println("The factorial of " + factorial + " is = " + num);
        } else if (factorial<0) {
            System.out.println("The factorial of negative number is not defined");
        }else {
        for (int k=1;k<=factorial;k++){
            num *= k;
        }System.out.println("The factorial of " + factorial + " is = " + num);
        }

        //prime number
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter starting number");
        int n1 = sc2.nextInt();
        System.out.println("Enter ending number");
        int n2 = sc2.nextInt();

        for (int l=n1; l<=n2;l++){
            int p;
            for (p=2;p<l;p++){
                if (l%p==0){
                    break;
                }
            }
            if (p==l){
                System.out.print(l + " ");
            }
        }

        //fibonacci series
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the number");
        int count = sc4.nextInt();
        int n9 = 0,n8=1,n7;
        if (count==1) {
            System.out.print(n9);
        }else  {
            System.out.print(n9 + " " + n8 + " ");
        }
        for (int m=2;m<count;m++){
            n7 = n9 + n8;
            System.out.print(n7 + " ");
            n9 = n8;
            n8 = n7;
        }

        //star pyramid
        int n=4;
        for (int q=1;q<=n;q++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("* ");

            }
            System.out.println();
        }


    }
}
