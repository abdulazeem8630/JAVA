import java.util.Arrays;


public class _4_Searching {
    static void main(String[] args) {
        int[] arr = {10,30,50,15,24,44,12,22,34};
        int target = 50;

        //Linear Search
        boolean flag = false;
        for(int i=0; i< arr.length; i++){
            if (arr[i]==target){
                flag = true;
                System.out.println("At index " + i + " Target is found : " + target);
            }
        }
        if(!flag){
            System.out.println("Target is not found");
        }

        //Binary Searching
        Arrays.sort(arr);
        System.out.println("Sorted Array");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        int low = 0;
        int high = arr.length-1;
        boolean sign = false;
        while (low<=high){
            int mid = (low + high)/2;
            if (arr[mid]==target){
                sign = true;
                System.out.print("Index of target : " + mid);
                break;
            } else if (target > arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        if (!sign){
            System.out.println("Target is not found");
        }
    }
}
