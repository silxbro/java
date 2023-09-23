package thisisjava.ch12.sec03.exam02;

public class Student {
  private int no;
  private String name;

  public Student(int no, String name) {
    this.no = no;
    this.name = name;
  }

  public int getNo() { return no; }
  public String getName() { return name; }

  @Override
  public int hashCode() {
    int hashCode = no + name.hashCode();
    return hashCode;
  }
  /*
  Object의 hashCode() 메소드를 재정의해서
  학생 번호와 이름 해시코드를 합한 새로운 해시코드를 리턴하도록 함
  (번호와 이름이 같으면 동일한 해시코드가 생성됨)
   */

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student target) {
      if (no == target.no && name.equals(target.name)) {
        return true;
      }
    }
    return false;
  }
  /*
  Object의 equals() 메소드를 재정의해서
  Student 객체인지를 확인하고, 학생 번호와 이름이 같으면 true를 리턴하도록 함
   */
}
