package exday2;

public class Sample{
    public static void main(String[] arrgs){
        Car car = new Car(); // コンストラクタが呼び出され、インスタンスが生成される.
        car.supply(10);
        car.move();
        car.move();
        Ambulance ambulance = new Ambulance();
        ambulance.supply(10);
        ambulance.move();
        ambulance.savePeople();

        // 暗黙の親クラスであるObjectクラスのメソッドを呼び出すことができる
        // Javaのすべてのクラスは、暗黙のうちに、Objectオブジェクトを継承している
        System.out.println(car.toString());
        System.out.println(car.getClass());
    }
}
