public class OOPS {
    public static void main(String[] args) {
        Cat Sia = new Cat();
        Sia.legs = 2;
        System.out.println(Sia.legs);
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
class Dog extends Mammals{
    String Breed;
}
class Cat extends Mammals{
    int eyes;
}