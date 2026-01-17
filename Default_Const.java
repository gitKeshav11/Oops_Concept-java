package OOps_Concept;

class B {
    int a;
    String b;
    boolean c;

    B() {
        a = 100;
        b = "ankit";
        c = true;
    }

    void Disp() {
        System.out.print(a + " " + b + " " + c);
    }
}

public class Default_Const {
    public static void main(String[] args) {
        B r = new B();
        r.Disp();
    }
}
