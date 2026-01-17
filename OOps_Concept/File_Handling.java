package Oops.OOps_Concept;
import java.io.*;

public class File_Handling {
    public static void main(String[] args)throws IOException {
        File f = new File("C:\\Users\\kesha\\OneDrive\\Desktop\\LC.txt");

        if (f.createNewFile()) {
            System.out.println("File Successfully Created.....!");
        } else {
            System.out.println("File Already Exist....");
        }
    }
}
