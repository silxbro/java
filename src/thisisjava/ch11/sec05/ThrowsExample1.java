package thisisjava.ch11.sec05;

public class ThrowsExample1 {
  public static void main(String[] args) {
    try {
      findClass();
    } catch (ClassNotFoundException e) {  // 호출한 곳에서 예외 처리
      System.out.println("예외 처리: " + e.toString());
    }
  }

  public static void findClass() throws ClassNotFoundException {
    Class.forName("java.lang.String2");
  }

  /*
  예외 처리: java.lang.ClassNotFoundException: java.lang.String2
   */
}
