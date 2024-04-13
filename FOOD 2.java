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
    

    food food1=new food("milk",35);
    food food2=new food("drink",50);
    food food3=new food("cake",45);

    food[] fridge={food1,food2,food3};

    System.out.println(fridge[2].price);

  }
}
