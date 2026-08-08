public class _2TwoD_Array {
    static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        //Row wise traversal
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Column wise traversal
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //Enhanced For Loop
        for (int[] num : arr){
            for (int col : num){
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
}
