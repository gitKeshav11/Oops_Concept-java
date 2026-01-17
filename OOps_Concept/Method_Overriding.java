package Oops.OOps_Concept;

      class shape{
          void draw(){
              System.out.print("Can't Say shape Type");
          }
      }

      class square extends shape{
          @Override
          void draw()
          {
              System.out.println("Square Shape");
          }
      }
public class Method_Overriding {
    public static void main(String [] args){
        shape r=new square();
        r.draw();
    }

}
