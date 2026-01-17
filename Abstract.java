package Oops;

abstract class animal{
    void legs(){
        System.out.println("All Animals have Four Legs");
    }
    abstract void sound();
    abstract void eat();
}

class Dog extends animal
{
    @Override
    void sound(){
        System.out.println("Bow Bow .......Bow");
    }
    void eat(){
        System.out.println("Meat Eating");
    }
}

class Cow extends animal
{
    @Override
    void sound(){
        System.out.println("Ooo Ooo .......Ooo");
    }
    void eat(){
        System.out.println("Grass Eating");
    }
}
public class Abstract {
    public static void main(String [] args){
        Dog d=new Dog();
        Cow c=new Cow();

        d.sound();
        d.eat();
        c.eat();
        c.sound();
    }
}
