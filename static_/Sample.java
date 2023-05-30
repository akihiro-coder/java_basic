package static_;


class Sample{
  public static void main(String[] args){
    // 静的メンバへのアクセスはオブジェクト生成は必要ない　生成してアクセスもできる
    System.out.println(SampleClass.staticVal);
    SampleClass.methodB();

    SampleClass obj = new SampleClass();
    System.out.println(obj.instanceVal);
    System.out.println(obj.staticVal);
    obj.methodA();
    obj.methodB();
  }
}

