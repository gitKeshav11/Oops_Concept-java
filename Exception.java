package Oops.OOps_Concept;

public class Exception {
    public static void main(String[] args){
        System.out.println("main method started");

        int a=10,b=0,c;

        try{
            c=a/b;
            System.out.println(c);
        }
        catch (java.lang.Exception e)
        {
            System.out.println(e);
        }

        System.out.println("main method ended");
    }
}
