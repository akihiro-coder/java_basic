package exday6;

import java.util.*;

public class Sample1{
  public static void main(String[] args){
    // HashMap<(キーのクラス).(値のクラス)> pythonの辞書型に似ている
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    String nengo[] = {"meiji", "taisho", "shouwa", "heisei"};
    map.put(nengo[0], 1868); // putで値の格納
    map.put(nengo[1], 1912);
    map.put(nengo[2], 1926);
    map.put(nengo[3], 1989);
    for(String s: nengo){
      System.out.println(s + "元年は、西暦" + map.get(s) + "年"); // getで値の取り出し
    }
  }
}
