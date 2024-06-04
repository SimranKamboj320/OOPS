public class OOPS {
    public static void main(String[] args) {
        Horse h = new Horse();
    }
}
class Animal { 
    Animal(){
        System.out.println("Animal constructor is called");
    }
}
class Horse extends Animal{
    Horse(){
        super();//Animal class constructor is called
        System.out.println("Horse constructor is called");
    }
} //super means immediate parent class
// super keyword is called by defauly also