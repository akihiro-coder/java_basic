package exday5;

import java.util.*;

public class Sample{
    public static void main(String[] args) {
        // <Student>これはデータの格納を限定するということを意味する。「ジェネリクス」と呼ぶ。これを付けないと、どんなデータでも追加できてしまい、Studentクラス以外のクラスのインスタンスをも格納できてしまい、問題が発生する可能性があるため危険。
        ArrayList<Student> arrList = new ArrayList<Student>();
        arrList.add(new Student("Tom", 1, 12));
        arrList.add(new Student("Ken", 2, 32));
        arrList.add(new Student("Mary", 3, 45));

        // 一般的な書き方
        for (int i = 0; i < arrList.size(); i++){
            Student s = (Student)arrList.get(i); // i番目のオブジェクトを取得
            System.out.println("番号：," + s.getNumber() + "名前：," + s.getName() + "学年：" + s.getGrade());
        }
        // 特殊for文を使った書き方　コレクション(arrList)に入っている値が、変数(s)に一つずつ代入され、コレクション内のすべてのデータを出しつくすと、ループが終了するようになっている。
        for (Student s : arrList) {
            System.out.println("番号:" + s.getNumber() + "名前：" + s.getName() + "学年：" + s.getGrade());
        }
    }
}
