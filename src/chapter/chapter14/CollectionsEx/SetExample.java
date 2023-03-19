package chapter.chapter14.CollectionsEx;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("poxos", "poxosyan", 22));
        students.add(new Student("petri", "petrosyan", 14));
        students.add(new Student("asteliks", "asatryan", 999));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
