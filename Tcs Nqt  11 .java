public class Solution {
    public static void main(String[] args) {
        int[] a={1,2,3,4,1,2,2,33,3};
        int n=a.length;
        boolean flag[]=new boolean[n];

        for(int i=0;i<n;i++){

            if(flag[i]==true){
                continue;
            }
            for(int j=i+1;j<n;j++){
                if(a[i]==a[j]){
                    flag[j]=true;
                }
            }
            System.out.print(a[i]+" ");
        }  
    }
}
