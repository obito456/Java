class Pub {
    void allows(int age){
        if(age>18){
            System.out.println("allow");
        }
        else{
            throw new IllegalArgumentException("you are a kid go and drink maaza");
        }
    }
}

public class pack { 
  public static void main(String[] args) {

    Pub access=new Pub();
    access.allows(15);
    
  }
}
