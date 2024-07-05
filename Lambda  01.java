public class pack {

    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Hello, World!");
        new Thread(runnable).start();

    }
}
