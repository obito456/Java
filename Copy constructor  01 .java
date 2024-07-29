class Hero{
    int num;
    public Hero(int num){
        this.num=num;
    }
    public Hero(Hero hero1){
        this.num=hero1.num;
    }
}

public class Solution {
    public static void main(String[] args) {
        Hero hero1=new Hero(1);
        Hero hero2=new Hero(hero1);

        System.out.println(hero1.num);
        System.out.println(hero2.num);
    }
}
