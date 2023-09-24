package thisisjava.ch12.sec04;

public class ErrExample {
  public static void main(String[] args) {
    try {
      int value = Integer.parseInt("1oo");
    } catch (NumberFormatException e) {
      System.err.println("[에러 내용]");
      System.err.println(e.getMessage());
    }

    /* ---> 아래 내용이 빨간색으로 표시됨
    [에러 내용]
    For input string: "1oo"
     */
  }
}
