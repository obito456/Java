public class Main {
    public static void main(String[] args) {
        
        try {
            int[] a={1,2,3,4,5};
            System.out.println(a[5]);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
