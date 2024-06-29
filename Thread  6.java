public class  pack{
    public static void main(String[] args) throws InterruptedException{
        
        Mythread thread2=new Mythread();
        thread2.setPriority(10);
        System.out.println(thread2.getPriority());
    }
}

public class Mythread extends Thread {
    
    @Override
    public void run(){
        System.out.println("running");
    }
}
