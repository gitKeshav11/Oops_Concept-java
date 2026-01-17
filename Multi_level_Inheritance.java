package Oops.OOps_Concept;

class A{
    int a,b,c;

    void add(){
        a=10; b=20;
        c=a+b;
        System.out.println("Sum of A & B is : "+c);
    }

    void sub(){
         a=200; b=100;
        c=a-b;
        System.out.println("Subtraction of A & B is: "+c);
    }

}

class B extends A{
    void multi(){
        a=10; b=20;
        c=a*b;
        System.out.println("Multiplecation of Two Numbers: "+c);
    }

    void div(){
        a=10; b=2;
        c=a/b;
        System.out.println("Division of A & B is: "+c);

    }
}

class C extends B{
    void rem(){
        a=10; b=3;
        c=a%b;
        System.out.println("Reminder fo Two Number: "+c);
    }
}
class Multi_level_Inheritance {
    public static void main(String[] args){
        C r=new C();
        r.add();
        r.sub();
        r.multi();
        r.div();
        r.rem();
    }

}
