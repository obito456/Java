public class ReplaceAllExample {
    public static void main(String[] args) {
        String original = "hello world 123";
        String modified = original.replaceAll("\\d", "x");
        System.out.println(modified);  // Output: hello world xxx
    }
}
