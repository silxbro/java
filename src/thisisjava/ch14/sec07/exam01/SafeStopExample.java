package thisisjava.ch14.sec07.exam01;

public class SafeStopExample {
  public static void main(String[] args) {
    PrintThread printThread = new PrintThread();
    printThread.start();

    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
    }
    printThread.setStop(true);  // PrintThread를 종료하기 위해 stop 필드 변경

    /*
    ...
    실행 중
    실행 중
    리소스 정리
    실행 종료
     */
  }
}
