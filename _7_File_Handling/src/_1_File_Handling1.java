import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class _1_File_Handling1 {
    static void main(String[] args) throws IOException{
        //Create file
        File file = new File("data.txt");
//        if(file.createNewFile()){
//            System.out.println("File created");
//        }else {
//
//            System.out.println("File already exists");
//        }
//        //path
//        Path path = Path.of("data.txt");
//        System.out.println(path.getFileName());
//        System.out.println(path.getParent());
//        System.out.println(path.toAbsolutePath());
//
//        //Files class
//        //Path path = Path.of("data.txt");
//        System.out.println(Files.exists(path)); //Check File Exists
        Path path0 = Path.of("C:\\Users\\azeem\\Desktop\\JAVA\\data.txt");
        System.out.println(Files.isDirectory(path0)); //Check Directory
        System.out.println(Files.isRegularFile(path0)); //Check file

        //Create Directory
        Path path1 = Path.of("Document");
        if (Files.notExists(path1)){
            Files.createDirectory(path1);
            System.out.println("Folder ban gya");
        }else {
            System.out.println("Folder pehle se bna hua h");
        }
        //createDirectories() -->Nested directories ke liye:<--
        Path path2 = Path.of("C:\\Users\\azeem\\Desktop\\JAVA\\_7_File_Handling\\files");
        try{
            Files.createDirectories(path2);
            System.out.println("Directories Create Successfully");
        } catch (IOException e) {
            System.out.println("Error occurred " + e.getMessage());
        }
        File file1 = new File("_7_File_Handling/files/first.txt");
        if(file1.createNewFile()){
            System.out.println("File created");
        }else {

            System.out.println("File already exists");
        }

        //Read file
        String content = Files.readString(Path.of("_7_File_Handling/files/first.txt"));
        System.out.println(content);
        //readAllLines() complete file ko memory me load karta hai.
        var lines = Files.readAllLines(Path.of("_7_File_Handling/files/first.txt"));
        for(String line : lines){
            System.out.println(lines);
        }

        //Write file
        Path path3 = Path.of("_7_File_Handling/files/first.txt");
//        Files.writeString(path3,"Hello Java"); //ye existing data ko overwrite kr skti h vo delete ho jaega
//        System.out.println("Data Written");

        //Append
//        Files.writeString(path3,"\nWelcome", StandardOpenOption.APPEND);
//        System.out.println("Done");

        //Create + Append
//        Files.writeString(Path.of("_7_File_Handling/files/second.txt"),
//                "Hey Java",
//                StandardOpenOption.CREATE,
//                StandardOpenOption.APPEND
//        );

        //Delete file
        if (Files.exists(Path.of("data.txt"))){
            Files.delete(Path.of("data.txt"));
            System.out.println("Delete successfully");
        }else {
            System.out.println("File does not exist");
        }

        //deleteIfExists()
        Files.deleteIfExists(Path.of("data.txt"));
        System.out.println("Completed");

        //Copy
        Path source = Path.of("_7_File_Handling/files/first.txt");
        Path destination = Path.of("_7_File_Handling/files/third.txt");
//        Files.copy(source,destination);
//        System.out.println("Copy Successful");

        //Copy with Replace  (Agar destination already exist kar sakti hai)
//        Files.copy(
//                source,
//                destination,
//                StandardCopyOption.REPLACE_EXISTING
//        );
        File file2 = new File("data.txt");
        if(file2.createNewFile()){
            System.out.println("File created");
        }else {

            System.out.println("File already exists");
        }
        //Move
        Path source1 = Path.of("data.txt");
        Path destination1 = Path.of("_7_File_Handling/files/data.txt");
//        Files.move(source1,destination1);
        //Move + Replace
//        Files.move(
//                source,
//                destination,
//                StandardCopyOption.REPLACE_EXISTING
//        );

        //File Metadata  (Useful methods)
        Path path4 = Path.of("_7_File_Handling/files/second.txt");
        System.out.println(Files.size(path4));
        System.out.println(Files.isReadable(path4));
        System.out.println(Files.isWritable(path4));
        System.out.println(Files.isExecutable(path4));
        //Last modified time
        System.out.println(
                Files.getLastModifiedTime(path4)
        );

        //List Directory
        Path path5 = Path.of("_7_File_Handling");
        try(var stream = Files.list(path5)){
            stream.forEach(System.out::println);
        }
        //Directory Walk  (Agar nested folders bhi traverse karne hain)
        try(var stream = Files.walk(path5)){
            stream.forEach(System.out::println);
        }

    }
}