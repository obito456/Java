class NotGeneric {
  private String lesson;
  private double score;

  public<T extends String,V extends Number>NotGeneric(T name,V value){
    this.lesson=name;
    this.score=value.doubleValue();
  }
  void display(){
    System.out.println(lesson+" : "+score);
  }
}

public class pack {
  public static void main(String[] args) {
    NotGeneric lesson1=new NotGeneric("math", 10);
    NotGeneric lesson2=new NotGeneric("science", 15.5);

    lesson1.display();
    lesson2.display();
  }
}
