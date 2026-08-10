import java.io.*;

public class _2_Advance_in_File_Handling {
    static void main(String[] args) throws IOException, ClassNotFoundException {

        //Byte Stream
        //FileInputStream  (File se bytes read karne ke liye.)
//        FileInputStream input = new FileInputStream("_7_File_Handling/files/second.txt");
//        int data;
//        while ((data = input.read()) != -1){
//            System.out.print((char) data);
//        }
//        input.close();

        //FileOutputStream (File me bytes write karne ke liye.)
//        FileOutputStream output = new FileOutputStream("_7_File_Handling/files/first.txt");
//        output.write(65); //-->A
//        output.close();
        //Byte Array ke Through Write
//        byte[] data1 = "Hello".getBytes();
//        output.write(data1); //-->Hello
//        output.close();

        //Character stream
        //FileReader (Text file read krne ke liye)
//        FileReader reader = new FileReader("_7_File_Handling/files/third.txt");
//        int ch;
//        while((ch = reader.read()) != -1){
//            System.out.println((char) ch);
//        }
//        reader.close();

        //FileWriter  (Text file me characters write karne ke liye)
//        FileWriter writer = new FileWriter("_7_File_Handling/files/first.txt");
//        writer.write("My name is Azeem");
//        writer.close();

        //Filewriter append
//        FileWriter writer1 = new FileWriter("_7_File_Handling/files/first.txt",true);
//        writer1.write("\nsir\nThis is txt file");
//        writer1.close();

//        FileReader fileReader = new FileReader("_7_File_Handling/files/first.txt");
//        int ch1;
//        while ((ch1=fileReader.read())!=-1){
//            System.out.println((char) ch1);
//        }
//        fileReader.close();

        //Buffered Streams (Directly har single byte/character ke liye file access karna inefficient ho sakta hai.
                             //Buffered streams ek memory buffer use karte hain.)

        //BufferedInputStream  (Byte input ko buffer karta hai)
//        BufferedInputStream input0 = new BufferedInputStream(
//                             new FileInputStream("_7_File_Handling/files/first.txt")
//        );
//        int data1;
//        while ((data1 = input0.read())!= -1){
//            System.out.println((char) data1);
//        }
//        input0.close();

        //BufferedOutputStream  (Byte output ko buffer karta hai)
//        BufferedOutputStream output0 = new BufferedOutputStream(
//                             new FileOutputStream("_7_File_Handling/files/second.txt")
//        );
//        output0.write("Hello..World...".getBytes());
//        output0.close();

        //BufferedReader (Text file ko efficiently read karne ke liye)
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("_7_File_Handling/files/first.txt"));
//        //readLines()
//        String line;
//        while ((line=bufferedReader.readLine())!=null){
//            System.out.println(line);
//        }

        //BufferedWriter (Text write karne ke liye)
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("_7_File_Handling/files/second.txt"))) {
//            writer.write("Hello java");
//            writer.newLine();
//            writer.write("Welcome");
//
//            System.out.println("done");
//        } catch (IOException e) {
//            System.out.println("File write karne mein error aaya: " + e.getMessage());
//        }

        //Serialization (Java object ko byte stream me convert karna)
        class Student implements Serializable{
            //serialVersionUID (Serialization compatibility ke liye important)
            private static final long serialVersionUID = 1L;
            int id;
            String name;
            transient String password; //transient
            Student(int id,String name, String password){
                this.id = id;
                this.name = name;
                this.password = password;

            }
        }
        Student s = new Student(101, "Azeem" , "secret123");
//        //ObjectOutputStream (Object ko stream me write karne ke liye)
        ObjectOutputStream outputStream =
                new ObjectOutputStream(
                        new FileOutputStream("_7_File_Handling/student.ser")
        );
        outputStream.writeObject(s);
        outputStream.close();

        //Deserialization (Ab .ser file se object retrieve karte hain)
        ObjectInputStream inputStream =
                new ObjectInputStream(
                        new FileInputStream("_7_File_Handling/student.ser")
                );
        Student s1 = (Student) inputStream.readObject();
        inputStream.close();
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.password);


    }
}
