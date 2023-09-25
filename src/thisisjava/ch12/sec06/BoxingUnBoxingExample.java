package thisisjava.ch12.sec06;

public class BoxingUnBoxingExample {
  public static void main(String[] args) {
    // Boxing
    Integer obj = 100;
    System.out.println("value: " + obj.intValue());  // value: 100
    // intValue() 메소드는 Integer 객체 내부의 int 값을 리턴한다.

    // UnBoxing
    int value = obj;
    System.out.println("value: " + value);           // value: 100

    // 연산 시 Unboxing
    int result = obj + 100;
    System.out.println("result: " + result);         // result: 200
  }
}
