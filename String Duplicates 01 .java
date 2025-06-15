import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        String secret="abccba@&@!123";
        HashSet<Character> unique=new HashSet<>();
        HashSet<Character> duplicate=new HashSet<>();

        for(char c:secret.toCharArray()){
            if(!unique.add(c)){
                duplicate.add(c);
            }
        }
        System.out.println(duplicate); 
    }
}
