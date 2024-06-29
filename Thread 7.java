public class  pack{
    public static void main(String[] args) throws InterruptedException{
        
        Mythread thread2=new Mythread();
        thread2.start();
        System.out.println(Thread.activeCount());
    }
}

public class Mythread extends Thread {
    
    @Override
    public void run(){
        System.out.println("running");
    }
}
