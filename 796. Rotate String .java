class Solution {
    public boolean rotate(String a,String b){
        return a.length()==b.length() && (a+a).contains(b);   
    }
    public static void main(String[] args) {
        Solution solution=new Solution();
        String a="vijay";
        String b="ayvij";
        System.out.println(solution.rotate(a,b));
    }
}
