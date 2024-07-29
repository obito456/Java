import java.util.Arrays;

public class Solution{
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};
        int[] a=arr.clone();
        int[] b=Arrays.copyOf(arr, arr.length);
        int[] c=new int[arr.length];
        System.arraycopy(arr, 0, c, 0, arr.length);
        int[] d=Arrays.copyOfRange(arr, 0, arr.length);

        for(int a1:a){
        System.out.print(a1+" ");
        }
        for(int a2:b){
        System.out.print(a2+" ");
        }
        for(int a3:c){
        System.out.print(a3+" ");
        }
        for(int a4:d){
        System.out.print(a4+" ");
        }
    }
}
