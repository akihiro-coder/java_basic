package access_specifier;

// public: どこからでも呼び出せる // classの先頭にpublicがつくと、他のパッケージからアクセスができ、デフォルトのクラスは、同一パッケージ内からしかアクセスできないようになっている。
// ちなみにクラスの場合は、指定できる可視性は、デフォルトかpublicのみとなる。
public class SampleClass {
  // private: 同じクラス内からしか呼び出せない
    // int型のフィールド(privateで隠蔽する)
    private int number = 0;
    // String型のフィールド(privateで隠蔽する)
    private String str = "";
    // コンストラクタ メソッド名はクラス名と同じにする 
    public SampleClass(String str){
        this.str = str;
    }
    // number変数のセッター
    public void setNumber(int number){
        this.number = number;
    }
    // number変数のゲッター
    public int getNumber(){
        return this.number;
    }
    // str変数のゲッター
    public String getStr(){
        return this.str;
    }
}
