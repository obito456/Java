public class Solution {
    public static String rev(String s,int i,int j){
        StringBuilder sb=new StringBuilder(s);
        sb.setCharAt(i, s.charAt(j));
        sb.setCharAt(j, s.charAt(i));
        return sb.toString();
    }
    public static void main(String[] args) {

        String s = "vijaykumar";
        int left=0;
        int right=s.length()-1;
        
        while(left<right){
            s=rev(s, left, right);
            left++;
            right--;
        }
        System.out.println(s);
    }
}
