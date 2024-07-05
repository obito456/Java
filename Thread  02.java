public class pack {

    public static void main(String[] args) throws InterruptedException {

        for(int i=1;i<=5;i++){
            System.out.println(i);
            Thread.sleep(1500);
        }
        System.out.println("completed");
        
    }   
}
