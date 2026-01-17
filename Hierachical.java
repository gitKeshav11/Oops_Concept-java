package Oops;

class Z {
    void input() {
        System.out.println("Enter Your Name: ");
    }
}

class H extends Z {
    void show() {
        System.out.println("My name is Keshav Upadhyay....");
    }
}

class C extends Z {
    void Disp() {
        System.out.println("My name is Sanatan Upadhyay ......");
    }
}

public class Hierachical {
    public static void main(String[] args) {
        H obj = new H();
        C obj2 = new C();

        obj.input(); // inherited from Z
        obj.show();

        obj2.input(); // also inherited from Z
        obj2.Disp();
    }
}
