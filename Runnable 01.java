public class Solution { 
    public static class Fan implements Runnable{
        public void run(){
            System.out.println("Thread 1001 is running");
        }
    }
    public static void main(String[] args){
        Thread f1=new Thread(new Fan());
        f1.run();
    }  
}
