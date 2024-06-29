public class  pack{
    public static void main(String[] args) throws InterruptedException{
        
        Mythread thread2=new Mythread();
        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());
        thread2.start();
        System.out.println(Thread.activeCount());
    }
}

public class Mythread extends Thread {
    
    @Override
    public void run(){

        if(this.isDaemon()){
            System.out.println("Demon");
        }
        else{
            System.out.println("not deamon");
        }
    }
}
