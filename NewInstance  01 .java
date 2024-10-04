import java.lang.reflect.Constructor;

class Student {
    String name;
    int age;
    long phNumber;

    public Student(String name, int age, long phNumber) {
        this.name = name;
        this.age = age;
        this.phNumber = phNumber;
    }    
}

public class Solution {
    public static void main(String[] args) {
        try {

            Class<?> cs = Class.forName("Student");
            Constructor<?> constructor = cs.getConstructor(String.class, int.class, long.class);
            Object obj = constructor.newInstance("Geetha", 18, 7781236520L);
            Student student1 = (Student) obj;
            System.out.println(student1.phNumber);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
