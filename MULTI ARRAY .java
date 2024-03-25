public class hello {
    public static void main(String[] args) {
      
        int[][] a={{1,2,3,4},{5,6,7,8}};
        System.out.println(a[1][1]);
        a[1][1]=66;
        System.out.println(a[1][1]);

        for (int i = 0; i < a.length; ++i) {
          for(int j = 0; j < a[i].length; ++j) {
             System.out.println(a[i][j]);
          }
       }
    }   
}
  
