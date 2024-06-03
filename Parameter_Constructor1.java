public class OOPS {

    public static void main(String args[]) {
        Student s1 = new Student();
        Student s2 = new Student("Simran");
        System.out.println(s2);
        Student s3 = new Student(123);
        System.out.println(s3);
    }
}

class Student{
    String name;
    int roll;

    Student() {
        System.out.println("Constructor");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll) {
        this.roll = roll;
    }
}