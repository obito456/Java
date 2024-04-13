public class food{

    String name;
    int price;
    
    food(String name,int price){
        this.name=name;
        this.price=price;
    }
    
}


public class hello{
  public static void main(String[] args){
    
    food[] fridge=new food[3];

    food food1=new food("milk",35);
    food food2=new food("drink",50);
    food food3=new food("cake",45);

    fridge[0]=food1;
    fridge[1]=food2;
    fridge[2]=food3;

    System.out.println(fridge[1].price);

  }
}
