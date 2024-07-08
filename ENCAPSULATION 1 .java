class Profile{
  private String name;
  private int age;

  public void setname(String name){
    this.name=name;
  }
  public String getname(){
    return name;
  }
  public void setage(int age){
    this.age=age;
  }
  public int getage(){
    return age;
  }
}

public class pack {
  public static void main(String[] args) {
      
    Profile profile1=new Profile();
    Profile profile2=new Profile();
    profile1.setname("vijay");
    profile1.setage(24);
    profile2.setname("dhoni");
    profile2.setage(43);
    System.out.println(profile2.getage());
  }
}
