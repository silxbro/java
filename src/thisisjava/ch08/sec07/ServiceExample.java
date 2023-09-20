package thisisjava.ch08.sec07;

public class ServiceExample {
  public static void main(String[] args) {
    // 인터페이스 변수 선언과 구현 객체 대입
    Service service = new ServiceImpl();

    // 디폴트 메소드 호출
    service.defaultMethod1();
    System.out.println();
    service.defaultMethod2();
    System.out.println();

    // 정적 메소드 호출
    Service.staticMethod1();
    System.out.println();
    Service.staticMethod2();
    System.out.println();

    /*
    defaultMethod1 종속 코드
    defaultMethod 중복 코드 A
    defaultMethod 중복 코드 B

    defaultMethod2 종속 코드
    defaultMethod 중복 코드 A
    defaultMethod 중복 코드 B

    staticMethod1 종속 코드
    staticMethod 중복 코드 C
    staticMethod 중복 코드 D

    staticMethod2 종속 코드
    staticMethod 중복 코드 C
    staticMethod 중복 코드 D
     */
  }
}
