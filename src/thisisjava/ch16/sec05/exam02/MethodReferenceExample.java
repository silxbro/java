package thisisjava.ch16.sec05.exam02;

public class MethodReferenceExample {
  public static void main(String[] args) {
    Person person = new Person();    // (a,b) -> a.compareToIgnoreCase(b)
    person.ordering(String :: compareToIgnoreCase);  // 메소드 참조

    // 홍길동은 김길동보다 뒤에 옵니다.
  }
}
