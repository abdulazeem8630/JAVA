public class _6_Copying_Array {
    static void main(String[] args) {
        int[] arr = {1,33,88,15,56,44,9,22,74};

        //Manually copy
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        System.out.println("Original array");
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Copy array by manual");
        for (int copy : arr2){
            System.out.print(copy + " ");
        }

        //clone()
        int[] arr3 = arr.clone();
        System.out.println();
        System.out.println("Copy array by clone()");
        for (int copy : arr3){
            System.out.print(copy + " ");
        }

        //System.arraycopy()
        int[] arr4 = new int[arr.length];
        System.arraycopy(arr,0,arr4,0,arr.length);
        System.out.println();
        System.out.println("Copy array by System.arraycopy()");
        for (int copy : arr4){
            System.out.print(copy + " ");
        }
    }
}
