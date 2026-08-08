public class _3_2D_Array_questions {
    static void main(String[] args) {
        int[][] arr = {{10,30,50},{15,24,44},{12,22,34}};

        //Sum
        int sum = 0;
        for(int[] row : arr){
            for(int col : row){
                System.out.print(col + " ");
                sum += col;
            }
        }
        System.out.println();
        System.out.println("The sum is : = " + sum);

        //Maximum
        int max = 0;
        for(int[] row : arr){
            for(int col : row){
                System.out.print(col + " ");
                if(col>max){
                    max = col;
                }
            }
        }
        System.out.println();
        System.out.println("The maximum is : = " + max);

        //Minimum
        int min = arr[0][0];
        for(int[] row : arr){
            for(int col : row){
                System.out.print(col + " ");
                if(col<min){
                    max = col;
                }
            }
        }
        System.out.println();
        System.out.println("The minimum is : = " + min);

        //Transpose
        int[][] newArr = new int[arr[0].length][arr.length];
        for (int i=0; i< arr.length;i++){
            for (int j=0; j< arr[0].length; j++){
                newArr[j][i] = arr[i][j];
            }
        }
        System.out.println("New Transpose Array");
        for (int[] arr2 : newArr){
            for (int newArr2 : arr2){
                System.out.print(newArr2 + " ");
            }
        System.out.println();
        }

        //Diagonal sum
        System.out.println("Original Array");
        for(int[] num : arr){
            for (int col : num){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        int primarySum = 0;
        int secondarySum = 0;
        for (int i = 0; i < arr.length; i++) {
            primarySum += arr[i][i];
            secondarySum += arr[i][arr.length-1-i];
        }
        System.out.println("PrimarySum : " + primarySum);
        System.out.println("SecondarySum : " + secondarySum);
    }
}
