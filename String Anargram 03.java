
public class Solution {
    public static boolean isanargram(String a,String b) {
        if(a.length()!=b.length()){
            return  false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
        int[] freq=new int[26];

        for(int i=0;i<a.length();i++){
            freq[a.charAt(i)-'a']++;
            freq[b.charAt(i)-'a']--;
        }
        for(int count:freq){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a="move";
        String b="mole";
        boolean isanargram=isanargram(a, b);
        System.out.println(isanargram);
    }
}

//  Time=0(n)
//  Space=0(1)
