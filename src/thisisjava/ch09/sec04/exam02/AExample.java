package thisisjava.ch09.sec04.exam02;

public class AExample {
  public static void main(String[] args) {
    // A 객체 생성
    A a = new A();

    // A 메소드 호출
    a.useB();

    /*
    B-생성자 실행
    1
    B-method1 실행
    2
    B-method2 실행
     */
  }
}
