public class OOPS {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
class Animal { // Base class
    String color; // Property

    void eat() { // Function
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}
// Derived class/Subclass
class Fish extends Animal {
    int fins; // Property

    void swim() { // Function
        System.out.println("Swims in water");
    }
}
