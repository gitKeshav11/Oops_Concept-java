package OOps_Concept;


class J{
     int a=20201;
}

class K extends J{

        int a=2354;

        void show(){
            System.out.println(a);
            System.out.println(super.a);
        }
}

public class Super {
    public static void main(String[] args){
        K obj=new K();
        obj.show();
    }

}
