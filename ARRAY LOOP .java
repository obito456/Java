public class hello {
    public static void main(String[] args) {
      
        String[] a={"srk","msd","mb","pk"};
        //System.out.println(a);
        System.out.println(a[0]);
        a[3]="jsp";
        System.out.println(a[3]);
        System.out.println(a.length);

        for(int i=0;i<a.length;i++){
          System.out.println(a[i]);
        }

        for(String i:a){
          System.out.println(i);
        }
    }    
}
  
