import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private transient String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class Solution{
    public static void main(String[] args) {
        User user = new User("john_doe", "secret123");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            out.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        User deserializedUser = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"))) {
            deserializedUser = (User) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Serialized User: " + user);
        System.out.println("Deserialized User: " + deserializedUser);
    }
}
