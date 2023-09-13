package thisisjava.ch02.sec04;

public class FloatDoubleExample {
  public static void main(String[] args) {
    // 정밀도 확인
    float var1 = 0.1234567890123456789f;
    double var2 = 0.1234567890123456789;
    System.out.println("var1: " + var1);   // var1: 0.12345679
    System.out.println("var2: " + var2);   // var2: 0.12345678901234568 --> double 타입이 float 타입보다 약 2배 정도의 유효 자릿수를 가진다.

    // 10의 거듭제곱 리터럴
    double var3 = 3e6;
    float var4 = 3e6F;
    double var5 = 2e-3;
    System.out.println("var3: " + var3);   // var3: 3000000.0
    System.out.println("var4: " + var4);   // var4: 3000000.0
    System.out.println("var5: " + var5);   // var5: 0.002
  }
}
