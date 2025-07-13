public class Solution {
    public static boolean anagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int[] freq =new int[256];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int num:freq){
            if(num!=0){
                return false;
            }
        }
        return true;
    }  
    public static void main(String[] args) {
        String s1 ="Three" ;
        String s2 ="There" ;
        System.out.println(anagram(s1,s2));  
    }  
}

//  Time=0(n)  listen,silent
//  Space=0(n)
