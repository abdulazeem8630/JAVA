import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileService{
    void readFile() throws IOException{
        //file operation
    }
}

public class _1_Exception_handling {
    static void main(String[] args){
        //Checked exception (compiler check)
        try{
            FileReader file = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        //Unchecked exception
        int a=10;
        int b=0;
        try{
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println(e);
            //getMessage()
            System.out.println(e.getMessage());

            //toString()
            System.out.println(e.toString());
            e.printStackTrace();
        }

        //throw
        int age = 19;
        try {
            if (age<15){
                throw new IllegalArgumentException("Age must be 18 or above");
            }
            System.out.println("Allowed");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("All done");
        }


        //throws
        try{
            FileService f = new FileService();
            f.readFile();
        } catch (IOException e) {
            System.out.println("file error");
        }

        //Multiple Catch
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic problem");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }
        catch (Exception e) {
            System.out.println("Some other exception");
        }
    }
}