package OOPS;

abstract class Animal{

    Animal()    //constructor
    {
        System.out.println("Creating an Animal");
    }
    abstract void walk();
    public void eat(){
        System.out.println("and can eat");
    }
}

class Horse extends Animal
{
    Horse()
    {
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.print("Horse Walk with 4 legs ");
    }
}

class Chicken extends Animal{
    Chicken()
    {
        System.out.println("Created a Chicken");
    }
    public void walk(){
        System.out.print("Chicken Walk with 2 legs ");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();

        Chicken c1 = new Chicken();
        c1.walk();
        c1.eat();

//        Animal a1 = new Animal();        cannot be accessed as it is an abstract class
//        a1.walk();
    }
}
