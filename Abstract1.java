public class OOPS {
    public static void main(String args[]) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}    
abstract class Animal{
    String color;
    Animal(){
        color = "Brown";
    }
}    
class Horse extends Animal{
    void changeColor(){
        color = "Dark Brown";
    }
}
class Giraffe extends Horse{
    void changeColor(){
        color = "Yellow";
    }
}    