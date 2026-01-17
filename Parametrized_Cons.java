package OOps_Concept;

class C{
    int x , y;     // Paramerized Constructer 1

    C(int a, int b){
        x=a; y=b;     // Paramerized Constructer 2
    }

    C(int a, String b){
        System.out.println(a + " "+ b + " ");   // Method to display value
    }

    void show(){
        System.out.println(x + " " +y );
    }
}

public class Parametrized_Cons {
    public static void main(String[] args){
        C obj=new C(100,202001);
        C ref=new C(10, "Ankush");
        obj.show();

    }

}
