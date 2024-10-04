import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class Student implements Serializable {
    private String name;
    private int age;
    private transient long phNumber;

    public Student(String name, int age, long phNumber) {
        this.name = name;
        this.age = age;
        this.phNumber = phNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getPhNumber() {
        return phNumber;
    }
}

public class Solution {
    public static void main(String[] args) {

        Student student1 = new Student("Geetha", 18, 7780235520L);

        try (ObjectOutputStream Serial= new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            Serial.writeObject(student1);
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("students.ser"))) {
            Student Deserial = (Student) input.readObject();
            
            System.out.println("Object has been deserialized");
            System.out.println("Name: " + Deserial.getName());
            System.out.println("Age: " + Deserial.getAge());
            System.out.println("Phone Number: " + Deserial.getPhNumber());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
