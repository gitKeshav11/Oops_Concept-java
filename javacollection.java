package Oops.OOps_Concept;
import java.util.ArrayList;

public class javacollection {
    public static void main(String[] args){
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("Ankit");
        Name.add("Ankush");
        Name.add("Vinod");

        System.out.println(Name);
        Name.add("Anish");
        System.out.println(Name);
        Name.remove(1);
    }
}
