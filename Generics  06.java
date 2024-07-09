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
  boolean hassameavg(Generic<?> object){
    return calavg()==object.calavg();
  }
}

public class pack {
  public static void main(String[] args) {
      Integer[] intnum1={1,2,3,4,5};
      Generic<Integer> intcalc1=new Generic<>(intnum1);
      System.out.println(intcalc1.calavg());

      Double[] intnum2={6.0,2.5,3.0,4.0,5.0};
      Generic<Double> intcalc2=new Generic<>(intnum2);
      System.out.println(intcalc2.calavg());

      System.out.println(intcalc1.hassameavg(intcalc2));
  }
}
