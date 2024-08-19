class Animal {
    String name;
    String color;
    int legs;
    public Animal(String name,String color,int legs){
        this.name=name;
        this.color=color;
        this.legs=legs;
    }
}
class Cat extends Animal {

    public Cat(String name, String color, int legs) {
        super(name, color, legs);
    }}

public class Solution {
    public static void main(String[] args) {
        Cat[] cat = new Cat[10];
        cat[1]=new Cat("Tommy", "blue", 4);
        Animal[] animal = cat;  
        System.out.println(animal[1].color);
    }    
}
