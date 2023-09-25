package thisisjava.ch12.sec10;

import java.util.regex.Pattern;

public class PatternExample {
  public static void main(String[] args) {
    String regExp = "(02|010)-\\d{3,4}-\\d{4}";  // \\는 이스케이프 문자로 역슬래시(\) 하나를 문자열로 포함시킨다.
    String data = "010-123-4567";
    boolean result = Pattern.matches(regExp, data);
    if (result) {
      System.out.println("정규식과 일치합니다.");
    } else {
      System.out.println("정규식과 일치하지 않습니다.");
    }
    // 정규식과 일치합니다.

    regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
    data = "angel@mycompanycom";
    result = Pattern.matches(regExp, data);
    if (result) {
      System.out.println("정규식과 일치합니다.");
    } else {
      System.out.println("정규식과 일치하지 않습니다.");
    }
    // 정규식과 일치하지 않습니다. ---> @ 뒤에 최소한 하나의 점이 와야 한다.
  }
}
