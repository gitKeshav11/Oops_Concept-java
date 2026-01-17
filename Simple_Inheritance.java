package Oops;

// Base class
class Student {
    int roll;
    int marks;
    String name;

    protected void input() {
        System.out.println("Enter your Roll Number & Your Name: ");
        // You can add Scanner input here if needed.
    }
}

// Child class
class Ankit extends Student {
    void disp() {
        roll = 202022335;  // Note: roll not rol
        name = "ankit";
        marks = 89;
        System.out.println(roll + "  \n" + name + "  \n" + marks);
    }

    public static void main(String[] args) {
        Ankit r = new Ankit();
        r.input(); // Fixed method call syntax
        r.disp();
    }
}
