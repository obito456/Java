public class  pack{
    public static void main(String[] args) throws InterruptedException{
        
        Mythread thread2=new Mythread();
        thread2.run();
        System.out.println(thread2.isAlive());
    }
}

public class Mythread extends Thread {
    
    @Override
    public void run(){
        System.out.println("running");
    }
}
