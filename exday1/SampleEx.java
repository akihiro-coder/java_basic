package exday1;

public class SampleEx {
    public SampleEx(){
        System.out.println("コンストラクタ");
    }
    public void foo(){
        System.out.println("インスタンスメソッド");
    }
    public static void bar(){
        System.out.println("静的メソッド");
    }
    public static void main(String[] args){
        SampleEx i = new SampleEx(); // 「コンストラクタ」と表示される
        // 静的メソッドのアクセス方法3選
        i.bar(); // 静的メソッドは、実はインスタンスからも呼び出すことができる
        SampleEx.bar(); // 静的メソッドは、クラス名から呼び出すこともできる
        bar(); // 静的メソッドは、同じクラス内ならクラス名無しでも呼び出せる
               
        System.gc(); // ガーベージコレクタの呼び出し
    }
}
