import java.io.*;

//Custom Checked exception
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

//Custom Unchecked exception
class InvalidAgeException1 extends RuntimeException {
    public InvalidAgeException1(String message) {
        super(message);
    }
}

//Exception Chaining Example
class UserServiceException extends RuntimeException {
    public UserServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class _2_Exception_2 {
    static void checkAge(int age) throws InvalidAgeException{
        if (age<18){
            throw new InvalidAgeException("Age must be 18 or above");
        }
        System.out.println("Eligible");
    }
    static void main(String[] args) {
        try{
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        try {
            // database operation
        }
        catch (Exception e) {
            throw new UserServiceException(
                    "Unable to fetch user",
                    e
            );
        }

        //Try-With-Resources
        try (FileReader reader = new FileReader("data.txt")) {
            // use reader
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}
