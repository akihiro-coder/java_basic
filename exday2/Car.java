package exday2;

public class Car {
    private int fuel = 0;
    private int migration = 0;
    // コンストラクタ
    public Car() // コンストラクタは戻り値の指定が無い。インスタンス生成時に、一度だけ呼び出される。
    {
        System.out.println("Carオブジェクトの生成");
    }
    // 移動メソッド
    public void move()
    {
        if (fuel >= 0){
            migration++;
            fuel--;
        }
        System.out.println("移動距離: " + migration);
        System.out.println("燃料: " + fuel);
    }
    // 燃料補給メソッド
    public void supply(int fuel)
    {
        if (fuel > 0){
            this.fuel += fuel;
        }
        System.out.println("燃料: " + fuel);
    }
}
