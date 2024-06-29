public class  pack{
    public static void main(String[] args) throws InterruptedException{
        
        Mythread thread2=new Mythread();
        thread2.setName("win");
        System.out.println(thread2.getName());
    }
}

public class Mythread extends Thread {
    
    @Override
    public void run(){
        System.out.println("running");
    }
}
