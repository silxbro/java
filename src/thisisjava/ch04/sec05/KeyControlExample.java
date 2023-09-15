package thisisjava.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);   // Scanner 생성
    boolean run = true;                         // while 문의 조건식을 위한 변수 선언
    int speed = 0;

    while (run) {
      // 메뉴 생성
      System.out.println("---------------------------");
      System.out.println("1. 증속 | 2. 감속 | 3. 중지");
      System.out.println("---------------------------");
      System.out.print("선택: ");

      String strNum = scanner.nextLine();       // 키보드에서 입력한 내용을 읽음

      if (strNum.equals("1")) {
        speed++;
        System.out.println("현재 속도 = " + speed);
      } else if (strNum.equals("2")) {
        speed--;
        System.out.println("현재 속도 = " + speed);
      } else {
        run = false;                            // whiele 문의 조건식을 false로 만듦
      }
    }
    System.out.println("프로그램 종료");
    // 11라인의 while 조건식을 보면 run 변수의 값에 따라 while 문의 반복 여부가 결정된다.
    // 처음 run 변수의 값은 true이므로 while 문은 무한 반복된다.
    // 키보드로 3을 입력하면 run 변수의 값이 false가 되어 while 문의 조건식이 false가 된다. 이때 무한 반복을 종료하고 while 문을 빠져나간다.
    // while 문을 빠져나가는 또 다른 방법으로 break 문을 이용할 수도 있다.
  }
}
