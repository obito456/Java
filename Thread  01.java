public class pack {

    public static void main(String[] args) {

        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("vijay");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().isAlive());
    }   
}
