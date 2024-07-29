class Hero {
    private Hero() {
        throw new UnsupportedOperationException("Cannot instantiate Hero class");
    }
    public static void HeroMethod() {
        System.out.println("Hero method called");
    }
}

public class Solution {
    public static void main(String[] args) {
        Hero.HeroMethod();
    }
}
