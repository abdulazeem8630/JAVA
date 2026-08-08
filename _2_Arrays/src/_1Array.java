public class _1Array {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.println(arr); // ye array ka memory reference print krta h
        System.out.println(arr[0]); //ese access krte hn ek ek element ko
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " "); //isse sare element access kiye jate hn
            //arr.length property hai method nhi
        }
        System.out.println();
        //Traversal by Enhanced For Loop
        for (int num : arr){
            System.out.print(num + " "); // use jb sirf read krna ho
        }
    }
}