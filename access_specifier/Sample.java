package access_specifier;

public class Sample{
    public static void main(String[] args){
        SampleClass s = new SampleClass("Hello World.");
        s.setNumber(10);
        int number = s.getNumber();
        System.out.println(number);
        String str = s.getStr();
        System.out.println(str);
    }
}
