class Generic<X extends Number>{
  X[] nums;

  public Generic(X[] nums){
    this.nums=nums;
  }
  double calavg(){
    double sum=0d;
    for(X num:nums){
      sum=sum+num.doubleValue();
    }
    return sum / nums.length;
  }
  boolean hassameavg(Generic<X> object){
    return calavg()==object.calavg();
  }
}

public class pack {
  public static void main(String[] args) {
      Integer[] intnum1={1,2,3,4,5};
      Generic<Integer> intcalc1=new Generic<>(intnum1);
      System.out.println(intcalc1.calavg());

      Integer[] intnum2={6,2,3,4,5};
      Generic<Integer> intcalc2=new Generic<>(intnum2);
      System.out.println(intcalc2.calavg());

      System.out.println(intcalc1.hassameavg(intcalc2));
  }
}
