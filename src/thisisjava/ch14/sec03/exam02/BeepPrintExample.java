package thisisjava.ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample {
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {  // 작업 스레드 생성
      @Override
      public void run() {  // 작업 스레드가 실행하는 코드
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i=0; i<5; i++) {
          toolkit.beep();
          try { Thread.sleep(500); } catch (Exception e) {}
        }
      }
    });

    thread.start();

    for (int i=0; i<5; i++) {
      System.out.println("띵");
      try { Thread.sleep(500); } catch (Exception e) {}
    }

    /*
    띵
    띵
    띵
    띵
    띵
     */
  }
}
