public class  pack{
    public static void main(String[] args) throws InterruptedException{
        
        Mythread thread1=new Mythread();

        Myrunnable runnable1=new Myrunnable();

        Thread thread2=new Thread(runnable1);

        thread1.start();
        thread2.start();
    }
}

public class Mythread extends Thread {
    
    @Override
    public void run(){

       for(int i=10;i>0;i--){
        System.out.println("Thread #1:"+i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
       }
       System.out.println("Thread #1 is finished");
    }
}

public class Myrunnable implements Runnable {

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread #2:"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
        System.out.println("Thread #2 is finished");
    }

}
    

