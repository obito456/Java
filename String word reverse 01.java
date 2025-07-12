public class Solution {
    public static String rev(String s){
        String[] ss=s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=ss.length-1;i>=0;i--){
            sb.append(ss[i]+" ");
        }
        return sb.toString();
    }  
    public static void main(String[] args) {
        String name = "The king in the north is john snow";
        System.out.println(rev(name));  
    }  
}

//  Time=0(n)`
//  Space=0(n)
