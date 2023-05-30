package exday1;


// 静的メンバを持つクラス
public class SampleClass { 
    private int value = 0; // インスタンスフィールド
    private static int num = 0; // 静的フィールド
    // コンストラクタ1
    public SampleClass(int value){
        this.value = value;
        // 静的フィールドのインクリメント
        num++; // 静的フィールドへのアクセス時は、thisはつけない
    }
    // コンストラクタ2
    public SampleClass(){
        this(100); // 引数付きコンストラクタを呼び出す
    }
    // インスタンスの数を取得
    // クラスメソッド
    public static int getNumberOfInstance(){
        return num;
    }
    // インスタンスフィールドを取得
    // インスタンスメソッド
    public int getValue(){
        return this.value;
    }
}
