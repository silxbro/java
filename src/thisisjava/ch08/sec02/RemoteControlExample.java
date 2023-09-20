package thisisjava.ch08.sec02;

public class RemoteControlExample {
  public static void main(String[] args) {
    RemoteControl rc;
    rc = new Television();
    /*
    5~6 라인처럼 변수를 먼저 선언한 다음에 구현 객체를 대입해도 되지만,
    다음과 같이 변수 선언과 동시에 구현 객체를 대입할 수도 있다.
    > RemoteControl rc = new Television();
     */

    rc.turnOn();
    /*
    TV를 켭니다.
     */
  }
}
