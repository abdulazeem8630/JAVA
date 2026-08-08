public class _5_Sorting {
    static void main(String[] args) {

        //Bubble sort
        int[] arr = {10,30,50,15,24,44,12,22,34};
        for(int i=0; i< arr.length-1; i++){
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();

        //Selection sort
        int[] arr1 = {10,3,50,15,21,44,99,22,34};
        for (int i = 0; i < arr1.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr1.length ; j++) {
                if (arr1[j]<arr1[min]){
                    min=j;
                }
            }
            int temp = arr1[i];
            arr1[i] = arr1[min];
            arr1[min] = temp;
        }for (int num : arr1){
            System.out.print(num + " ");
        }
        System.out.println();

        //Insertion sort
        int[] arr2 = {1,33,88,15,56,44,9,22,74};
        for (int i = 1; i <arr2.length; i++) {
            int key = arr2[i];
            int j = i-1;
            while(j>=0 && arr2[j]>key){
                arr2[j+1] = arr2[j];
                j--;
            }
            arr2[j+1] = key;
        }
        for (int num : arr2){
            System.out.print(num + " ");
        }
    }
}
