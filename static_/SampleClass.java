package static_;


class SampleClass{
  int instanceVal = 100;
  static int staticVal = 200;
  void methodA() 
  {
    System.out.println("methodA():" + instanceVal);
  }
  static void methodB()
  {
    System.out.println("methodB():" + staticVal);
  }
}
