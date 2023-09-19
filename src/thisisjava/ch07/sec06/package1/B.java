package thisisjava.ch07.sec06.package1;  // A 클래스와 같은 패키지

public class B {
  // 메소드 선언
  public void method() {
    A a = new A();
    a.field = "value";
    a.method();
  }
}
