public class Solution {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hi vijay");
        sb.append(" kumar");
        sb.insert(0, "vipparthi ");
        sb.replace(0, 2, "ho");
        sb.delete(0, 9);
        sb.reverse();
        sb.toString();
        System.out.println(sb);
    }
}
