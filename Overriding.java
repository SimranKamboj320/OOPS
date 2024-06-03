public class OOPS {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}
class Animal { // Base class
    String color; // Property

    void eat() { // Function
        System.out.println("Eats Anything");
    }
}
// Derived class/Subclass
class Deer extends Animal {
    void eat(){  //Override
    System.out.println("Eats grass");
    }
}
