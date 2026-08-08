public class _6controlflow {
    public static void main(String[] args){

         //if statement
        int age = 20;
        if (age>=18){
            System.out.println("Eligible");
        }

        //if else statement
        int age1 = 2;
        if (age1>=18){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }

        //else if statement
        int marks = 7;
        if (marks>=90){
            System.out.println("Grade A");
        } else if (marks>=70) {
            System.out.println("Grade B");
        } else if (marks>=50) {
            System.out.println("Grade C");
        }else {
            System.out.println("Fail");
        }

        //nested if statement
        int age2 = 20;
        String gen = "man";
        if (age2>=18){
            if (gen=="man"){
                System.out.println("Eligible to Drive");
            }
            }else {
            System.out.println("Not Eligible");
        }

        //switch statement
        int day = 8;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }


        //Loop statement
        //for loop
        for (int i=0; i<=10; i++){
            System.out.println(i);
        }

        //while loop
        int i=0;
        while (i<=10){
            System.out.println(i);
            i++;
        }

        //do-while loop
        int k=0;
        do{
            System.out.println(i);
            k++;
        }while (k<=10);


        //enhanced for loop for arrays aur collections ke liye
        int arr[] = {10,20,30,44,66};
        for (int e:arr){
            System.out.println(e);
        }


        //Jump statement
         //1. break
        for (int j=0;j<=10;j++){
            if (j==5){
                break;
            }
                System.out.println(j);

        }

        //2. continue
        for (int l=0;l<=10;l++){
            if (l==5){
                continue;
            }
                System.out.println(l);

        }

        // 3. return
        _6controlflow obj = new _6controlflow();
        int n = obj.add();
        System.out.println(n);

    }
    public static int add(){
        return 10 + 40;
    }
}
