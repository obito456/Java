import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    public int id;
    public String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return "(id=" + id + ", name='" + name + ") ";
    }
}

public class Solution{
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Bob"));
        students.add(new Student(3, "Alice"));
        students.add(new Student(2, "Charlie"));

        System.out.println("Before sorting: " + students);
        Comparator<Student> idComparator = (s1, s2) -> Integer.compare(s1.id, s2.id);
        Collections.sort(students, idComparator);
        System.out.println("After sorting: " + students);
    }
}
