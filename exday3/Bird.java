package exday3;


// 共通処理はすべて抽象クラスに記述してしまうのがポイント
// 抽象クラス（鳥）
public abstract class Bird{
  // 名前フィールド 
  private String name;
  // 引数つきコンストラクタ
  Bird(String name){
    this.name = name;
  }
  // 名前の取得メソッド
  public String getName(){
    return this.name;
  }
  // 鳴くメソッド（抽象メソッド）
  abstract void sing(); // 処理はサブクラスで定義する
}
