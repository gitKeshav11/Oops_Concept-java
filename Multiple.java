package Oops;
                                   // First Type  //
//interface A {
//    void show();
//}
//
//interface B {
//    void show();
//}
//
//public class Multiple implements A, B {
//    // Proper method implementation
//    public void show() {
//        System.out.println("Interface A & B: ");
//    }
//
//    public static void main(String[] args) {
//        Multiple M = new Multiple();
//        M.show(); // Correct method call
//    }
//}
//                                       // Second Type  //

interface A {
    void show();
}

interface B {
    void Disp();
}

public class Multiple implements A, B {
    // Proper method implementation

    public void show() {
        System.out.println("Interface A & B: ");
    }

    public void Disp() {
        System.out.println("Interface A & B: ");
    }

    public static void main(String[] args) {
        Multiple M = new Multiple();
        M.show(); M.Disp(); // Correct method call
    }
}
