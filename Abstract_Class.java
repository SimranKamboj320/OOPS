public class OOPS {

    public static void main(String args[]) {
        Horse h = new Horse();
        h.eat();
        h.walk();

        Giraffe g = new Giraffe();
        g.walk();
    }
}

abstract class Animal{
    void eat(){//non abstract method
        System.out.println("Animal eats");
    }

    abstract void walk(); 
    // Abstract method/no implementation/no object
}  

class Horse extends Animal{
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Giraffe extends Animal{
    void walk(){
        System.out.println("Walks on 6 legs");
    }
}    