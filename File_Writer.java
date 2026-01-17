package Oops.OOps_Concept;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\kesha\\OneDrive\\Desktop\\LC.txt");

            try {
                writer.write("My Name is ..");
            } finally {
                writer.close();
            }

            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
