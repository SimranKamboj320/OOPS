public class OOPS {

    public static void main(String args[]) {
        Student s1 = new Student();
        //System.out.println(s1.name);
    }
}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constructor is called");
    }
}
//This is example of non-parameter constructor