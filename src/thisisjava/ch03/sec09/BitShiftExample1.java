package thisisjava.ch03.sec09;

public class BitShiftExample1 {
  public static void main(String[] args) {
    int num1 = 1;
    int result1 = num1 << 3;
    int result2 = num1 * (int)Math.pow(2,3);    // Math.pow()는 double 값을 산출하므로, int 값으로 얻고 싶다면 (int)로 캐스팅해야 한다.
    System.out.println("result1: " + result1);  // result1: 8
    System.out.println("result2: " + result2);  // result2: 8

    int num2 = -8;
    int result3 = num2 >> 3;
    int result4 = num2 / (int) Math.pow(2,3);
    System.out.println("result3: " + result3);  // result3: -1
    System.out.println("result4: " + result4);  // result4: -1
  }
}

