package thisisjava.ch12.sec03.exam02;

import java.util.HashSet;  // HashSet : java.util 패키지에 있으므로 import해야 함

public class HashSetExample {
  public static void main(String[] args) {
    HashSet hashSet = new HashSet();    // HashSet 컬렉션 생성
    
    Student s1 = new Student(1, "홍길동");
    hashSet.add(s1);   // HashSet에 Student 객체 저장
    System.out.println("저장된 객체 수: " + hashSet.size());  // 저장된 객체 수: 1

    Student s2 = new Student(1, "홍길동");
    hashSet.add(s2);   // HashSet에 Student 객체 저장
    System.out.println("저장된 객체 수: " + hashSet.size());  // 저장된 객체 수: 1
    /* --> 동등 객체는 중복 저장되지 않음
     s1 객체와 s2 객체는 학생 번호와 이름이 같기 때문에 동등 객체이다.
     따라서 s2가 저장될 때 이미 s1이 저장되어 있으므로 중복 저장되지 않는다.
     */

    /* Student 클래스에서 hashCode() 재정의 코드를 주석으로 처리하고 다시 실행해보기
     - hashCode()를 재정의하지 않으면 객체 번지로 해시코드를 생성하므로 객체가 다를 경우 해시코드도 달라진다.
       따라서 s1, s2는 동등 객체가 아니므로 따로 저장된다.
     - 실행 결과 ---> 저장된 객체 수: 2
     */

    Student s3 = new Student(2, "홍길동");
    hashSet.add(s3);   // HashSet에 Student 객체 저장
    System.out.println("저장된 객체 수: " + hashSet.size());  // 저장된 객체 수: 2
  }
}
