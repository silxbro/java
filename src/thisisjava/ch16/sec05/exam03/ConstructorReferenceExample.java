package thisisjava.ch16.sec05.exam03;

public class ConstructorReferenceExample {
  public static void main(String[] args) {
    Person person = new Person();

    Member m1 = person.getMember1(Member :: new);  // 생성자 참조
    System.out.println(m1);
    System.out.println();

    Member m2 = person.getMember2(Member :: new);  // 생성자 참조
    System.out.println(m2);

    /*
    Member(String id)
    { id: winter, name: null }

    Member(String id, String name)
    { id: winter, name: 한겨울 }
     */

    /*
    생성자 참조는 두 가지 방법 모두 동일하지만, 함수형 인터페이스의 매개변수 개수에 따라 실행되는
    Member 생성자가 다르다는 것을 확인할 수 있다.
     */
  }
}
