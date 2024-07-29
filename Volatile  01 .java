public class Solution {

    private static volatile boolean flag = false;
    public static void main(String[] args) {
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            flag = true; 
            System.out.println("Writer Thread: flag set to true");
        });

        Thread readerThread = new Thread(() -> {
            while (!flag) {
            }
            System.out.println("Reader Thread: detected flag change to true");
        });
        writerThread.start();
        readerThread.start();
    }
}
