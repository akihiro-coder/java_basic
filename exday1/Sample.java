package exday1;

public class Sample{
    // main()がついていると、プログラムはそこから実行される
    public static void main(String[] args){
        SampleClass s1, s2;
        // インスタンスの数を表示
        System.out.println("インスタンス数:" + SampleClass.getNumberOfInstance()); // 静的メソッドへのアクセスは, (class name).(static method)
        s1 = new SampleClass(50); // コンストラクタ① が使用される
        s2 = new SampleClass(); // コンストラクタ②　が使用される
        System.out.println(s1.getValue()); // 50
        System.out.println(s2.getValue()); // 100
        // インスタンスの数を表示
        System.out.println("インスタンス数:" + SampleClass.getNumberOfInstance()); // 2
    }
}
