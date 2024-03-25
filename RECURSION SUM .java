public class hello {

    static int sum(int a){
      if(a>0){
        return a+sum(a-1);
      }
      else{
        return 0;
      }
    }
    public static void main(String[] args) {
      int a=sum(4);
      System.out.println(a);
    }   
}
  
