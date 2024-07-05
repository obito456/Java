public class pack {

    public static class Second extends Thread{

        @Override
        public void run(){
            System.out.println("thread 2 is running"); 
        }
    }

    public static void main(String[] args) throws InterruptedException {


        Second sec=new Second();
        System.out.println(sec.isAlive());
        sec.run();
        System.out.println(sec.isAlive());
        sec.start();
        System.out.println(sec.isAlive());
    }   
}
