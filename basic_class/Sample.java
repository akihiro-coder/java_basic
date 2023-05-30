package basic_class;


public class Sample { 
    public static void main(String[] args) {
        SampleClass s1, s2;
        s1 = new SampleClass();
        s2 = new SampleClass();
        // フィールドに値を代入
        s1.n = 100;
        s2.n = 200;
        s1.s = "Hello";
        s2.s = "Hi!";
        // メソッドの呼び出し
        int ans1 = s1.add(1,2);
        int ans2 = s2.add(1,10);
        String str1 = s1.add("World");
        String str2 = s2.add("Tom");
        // 呼び出し結果の表示
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(str1);
        System.out.println(str2);
        s1.showNum();
        s2.showNum();
    }
}
