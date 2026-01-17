package Oops.OOps_Concept;

import java.io.IOException;

public class FileReader {

    public static void main(String[] args) {
        try {
            java.io.FileReader r = new java.io.FileReader("C:\\Users\\kesha\\OneDrive\\Desktop\\LC.txt");

            try {
                int i;
                while ((i = r.read()) != -1) {
                    System.out.print((char) i);
                }
            } finally {
                r.close();
                System.out.println("File Closed.....");
            }

        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}
