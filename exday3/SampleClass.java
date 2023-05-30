package exday3;

public class SampleClass{
  public static void main(String args[]){
    Crow c = new Crow();
    Sparrow s = new Sparrow();
    // カラスが鳴く
    System.out.print(c.getName() + " : ");
    c.sing();
    // すずめが鳴く
    System.out.print(s.getName() + " : ");
    s.sing();
  }
}
