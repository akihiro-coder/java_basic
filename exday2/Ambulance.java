package exday2;

// Carクラスを継承するときの書き方
public class Ambulance extends Car{
    // 番号
    private int number = 119;
    // コンストラクタ
    public Ambulance()
    {
        System.out.println("Ambulanceオブジェクト生成");
    }
    // 救急救命活動
    public void savePeople()
    {
        System.out.println("救命救急活動");
        System.out.println("呼び出しは" + number + "番");
    }
}
// 継承しても、privateフィールドであるfuel, migrationには直接アクセスできない
