import java.util.Arrays;

public class _7_Array_methods {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,5,15,35,50,45};

        //Arrays.toString()
        System.out.println("1D Array Element Print");
        System.out.println(Arrays.toString(arr)); //print all element of array

        //Arrays.deepToString()
        int[][] arr1 = {{10,20}, {30,40}};
        System.out.println("2D Array Element Print");
        System.out.println(Arrays.deepToString(arr1)); //2d array ke all element print

        //Arrays,sort()
        System.out.println("Array sort");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Arrays.parallelSort()
        System.out.println("Array sort by parallelSort");
        int[] arr2 = {1,20,30,42,5,16,35,52,44};
        Arrays.parallelSort(arr2);
        System.out.println(Arrays.toString(arr2));//large arrays ke liye fast

        //Arrays.binarySearch()
        int[] arr3 = {1,20,30,42,5,16,35,52,44};
        System.out.println("Binary Search");
        int index = Arrays.binarySearch(arr3,5);
        System.out.println(index);

        //Arrays.fill() (pure array me same value bhr dega)
        int[] newArr = new int[5];
        Arrays.fill(newArr,11);
        System.out.println("Arrays.fill()");
        System.out.println(Arrays.toString(newArr));
        System.out.println("Arrays.fill() partial fill");
        Arrays.fill(newArr,1,4,55);
        System.out.println(Arrays.toString(newArr));

        //Arrays.copyOf()  //naya array bnata h or copy krta h
        int copy[] = Arrays.copyOf(arr,10); //agr size old array se bda diya to 0 0 kr dega baaki value
        System.out.println("New copy array by copyOf()");
        System.out.println(Arrays.toString(copy));

        //Arrays.copyOfRange() //range me copy
        int copy1[] = Arrays.copyOfRange(arr,1, 4);
        System.out.println("New copy array with specific range");
        System.out.println(Arrays.toString(copy1));

        //Arrays.equals() for 1D array
        int[] a = {10,20,30};
        int[] b = {10,20,30};
        System.out.println("Compare a and b in 1D array");
        System.out.println(Arrays.equals(a,b));

        //Arrays.deepEquals() for 2D array
        int[][] c = {{1,2}, {3,4}};
        int[][] d = {{1,2}, {3,4}};
        System.out.println("Compare c and d in 2D array");
        System.out.println(Arrays.deepEquals(c,d));

        //Arrays.compare()
        int[] x={1,2,4};
        int[] y={1,2,3};
        System.out.println("Lexicographical Compare x and y array");
        System.out.println(Arrays.compare(x,y));

        //Arrays.mismatch() Ye batata hai Pehla different index kaunsa hai.
        int[] a1={10,20,30};
        int[] b1={10,25,30};
        System.out.println("Arrays.mismatch()");
        System.out.println(Arrays.mismatch(a1,b1));
    }
}
