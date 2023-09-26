package thisisjava.ch14.sec07.exam02;

public class InterruptExample {
  public static void main(String[] args) {
    Thread thread = new PrintThread();
    thread.start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
    }

    thread.interrupt();  // interrupt() 메소드 호출

    /*
    ...
    실행 중
    실행 중
    리소스 정리
    실행 종료
     */
  }
}
