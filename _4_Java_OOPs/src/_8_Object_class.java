import java.util.Objects;

class Student00 implements Cloneable{
    String name = "Azeem";
    int id = 123;
    public String toString(){
        return name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    //Objects Utility Class (java.util.Objects)  helper methods provide karti hai.
    //1. Objects.equals(a,b) Agar ek object null ho to bhi NullPointerException nahi aayega.
    //Objects.requireNonNull()  Agar null hua to exception throw karega.
    //2. Objects.hash()  Hash code generate karne ka easy tareeka.
    @Override
    public int hashCode(){
        return Objects.hash(id,name);
    }
}

public class _8_Object_class {
    static void main(String[] args) {
        //Java ME har class indirectly ya directly Object class ko inherit karti hai.
        //Har class ke paas Object ke methods automatically aa jaate hain.

        try{
            Student00 s = new Student00();
            Student00 s1 = new Student00();
            Student00 s3 = (Student00)s.clone();
            System.out.println(s3.name);
            System.out.println(s.equals(s1)); //false Default equals() reference compare krta hai.
            System.out.println(s.toString()); //Ye method object ko String me convert karta hai.
            System.out.println(s.hashCode()); //Object ka ek integer identity value return karta hai.
            System.out.println(s.getClass()); //Current object ki runtime class return karta hai.
            //Ye methods tumne banaye hi nahi.
            //Fir bhi chal rahe hain.  Reason --> Object Class.
            System.out.println(s.hashCode());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
