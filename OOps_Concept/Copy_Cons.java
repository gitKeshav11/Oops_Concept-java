package OOps_Concept;

class F
{
    int a;
    String b;
    boolean c;
    F(){
        a=202001;
        b="Sanatan_Upadhyay";
        c=true;
        System.out.println(a+" "+b+" "+c);
    }
    F(F ref){
        a=ref.a;
        b=ref.b;
        c=ref.c;
        System.out.println(a+" "+b+" "+c);
    }
}

public class Copy_Cons {
    public static void main(String[] args){
        F obj=new F();
        F obj2=new F(obj);
    }
}
