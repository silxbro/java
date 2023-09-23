package thisisjava.ch12.sec03.exam04;

public class RecordExample {
  public static void main(String[] args) {
    Member m = new Member("winter", "눈송이", 25);
    // Getter 메소드 호츨
    System.out.println(m.id());
    System.out.println(m.name());
    System.out.println(m.age());
    // toString() 메소드 호출
    System.out.println(m.toString());
    System.out.println();

    Member m1 = new Member("winter", "눈송이", 25);
    Member m2 = new Member("winter", "눈송이", 25);
    // hashCode(), equals() 메소드 호출
    System.out.println("m1.hashCode(): " + m1.hashCode());
    System.out.println("m2.hashCode(): " + m2.hashCode());
    System.out.println("m1.equals(m2): " + m1.equals(m2));  // 동등 비교

    /*
    winter
    눈송이
    25
    Member[id=winter, name=눈송이, age=25]

    m1.hashCode(): 306065155
    m2.hashCode(): 306065155
    m1.equals(m2): true
     */
  }
}
