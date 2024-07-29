class Hero {
    private static Hero instance;

    private Hero() {
    }

    public static Hero getInstance() {
        if (instance == null) {
            instance = new Hero();
        }
        return instance;
    }
}

public class Solution {
    public static void main(String[] args) {
        Hero hero1 = Hero.getInstance();
        Hero hero2 = Hero.getInstance();
        Hero hero3 = Hero.getInstance();

        System.out.println(hero1 == hero2);
        System.out.println(hero2 == hero3);
    }

}
