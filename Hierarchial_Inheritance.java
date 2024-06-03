public class OOPS {
    public static void main(String[] args) {
        Dog Johny = new Dog();
        Johny.eat();
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
class Mammals extends Animal{
    int legs;
}
class Dog extends Animal{
    String Breed;
}