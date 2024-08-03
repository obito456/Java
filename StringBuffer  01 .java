public class Solution {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        sb.append(" World");
        System.out.println(sb); 
      
        sb.insert(6, "Java ");
        System.out.println(sb); 
        
        sb.delete(6, 11);
        System.out.println(sb);
        
        sb.reverse();
        System.out.println(sb);
    }
}
