class Solution {
    public void rev(char[] s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left]; 
            s[left++]=s[right];
            s[right--]=temp;
        }
    }
    public static void main(String[] args) {
        Solution solution=new Solution();
        char[] s={'v','i','j','a','y'};
        solution.rev(s);
        System.out.println(new String(s));
    }
}
