package OOps_Concept;


class A{
    int a;
    String name;

    A(){
      a=0;
      name=null;
    }

    void Show(){
        System.out.print(a+" "+name);
    }
}
public class Constructor {
    public static void main(String[] args){
        A obj=new A();
        obj.Show();
    }

}
