public class  pack{
    public static void main(String[] args) throws InterruptedException{
        
        for(int i=3;i>0;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("done");
    }
}

public class Mythread extends Thread {
    
    @Override
    public void run(){
        System.out.println("running");
    }
}
