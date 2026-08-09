    //Encapsulation
    class Std{
        private int age;
        public void setAge(int age) {
            if (age>0){
                this.age = age;
            }else{
                System.out.println("Invalid age");
            }
        }
        public int getAge() {
            return age;
        }
    }

    //Immutable class
    final class Std1{
        private final String name;
        Std1(String name){
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }
public class _4_Encapsulation {
    static void main(String[] args) {
        Std s = new Std();
        System.out.println(s.getAge());
        s.setAge(12);
        System.out.println(s.getAge());
        Std1 s1 = new Std1("Azeem");
        System.out.println(s1.getName());
    }
}
