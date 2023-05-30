package exday6;

import java.util.*;

public class Sample2{
  public static void main(String[] args){
    // Hashhs<(値のクラス)> 重複なく値を格納できる
    HashSet<String> hs = new HashSet<String>();
    String nengo[] = {"meiji", "taisho", "shouwa", "heisei"};
    hs.add("Mike"); // addで値の格納
    hs.add("Mike"); // addで値の格納
    hs.add("Mike"); // addで値の格納
    hs.add("Mary"); // addで値の格納
    hs.add("Tom"); // addで値の格納
    hs.add("Mary"); // addで値の格納
    hs.add("Tom"); // addで値の格納
    for(String s: hs){
      System.out.println(s);
    }
  }
}
