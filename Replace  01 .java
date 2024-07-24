public class ReplaceExample {
    public static void main(String[] args) {
        String original = "hello world";
        String modified = original.replace('l', 'x');
        System.out.println(modified); 

        String original1 = "hello world";
        String modified1 = original.replace("world", "Java");
        System.out.println(modified1);
    }
}
