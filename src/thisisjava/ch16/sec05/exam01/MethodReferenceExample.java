package thisisjava.ch16.sec05.exam01;

public class MethodReferenceExample {
  public static void main(String[] args) {
    Person person = new Person();

    // 정적 메소드일 경우
    // 1) 람다식
    //person.action((x,y) -> Computer.staticMethod(x,y));
    // 2) 메소드 참조
    person.action(Computer :: staticMethod);

    // 인스턴스 메소드일 경우
    Computer com = new Computer();
    // 1) 람다식
    //person.action((x,y) -> com.instanceMethod(x,y));
    // 2) 메소드 참조
    person.action(com :: instanceMethod);

    /*
    결과: 14.0
    결과: 40.0
     */
  }
}
