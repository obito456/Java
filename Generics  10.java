import java.util.Arrays;
class Maximp<T extends Comparable<T>>implements Max {
  T[] x;

  public Maximp(T[] x){
    this.x=x;
  }
  public Comparable findmax(){
    return Arrays.stream(x).max(Comparable::compareTo).orElseThrow();
  }
}
interface Max <T extends Comparable<T>>{
  T findmax();
}

public class pack {
  public static void main(String[] args) {
    Integer[] integers={10,20,30};
    Maximp<Integer>intmax=new Maximp<>(integers);
    System.out.println(intmax.findmax());

    Double[] doubles={10.0,20.0,30d};
    Maximp<Double>doublemax=new Maximp<>(doubles);
    System.out.println(doublemax.findmax());
  }
}
