class Animal {
    public void prints() {
        
        final String name="Lion";
        class Wild{
            public void display(){
                System.out.println(name);
            }
        }
        Wild wild=new Wild();
        wild.display();
    }
}

public class Solution {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.prints();
    }
}
