package classwork;

public class StudentDemo {
    public static void main(String[] args) {
        String name = "Petros";
        String phoneNamber = "324343423";
        String coursName = "Java";
        Student student = new Student(name, phoneNamber, coursName);
        System.out.println(student.coursName);


    }
}
