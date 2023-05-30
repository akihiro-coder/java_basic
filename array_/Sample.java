package array;


public class Sample{
    public static void main(String[] args){
        // double[] d = new double[3];
        // d[0] = 1.2;
        // d[1] = 3.7;
        // d[2] = 4.1;
        double d[] =  {1.2, 3.7, 4.1}; // 配列の宣言と初期化をまとめて書くこともできる
        double sum, avg;
        sum = 0.0;
        for (int i = 0; i < d.length; i++){
            System.out.println(d[i] + " ");
            sum += d[i];
        }
        System.out.println();
        avg = sum / 3.0;
        System.out.println("合計値:" + sum);
        System.out.println("平均値:" + avg);
    }
}
