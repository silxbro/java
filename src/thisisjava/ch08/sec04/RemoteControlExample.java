package thisisjava.ch08.sec04;

public class RemoteControlExample {
  public static void main(String[] args) {
    // 인터페이스 변수 선언
    RemoteControl rc;

    // Television 객체를 생성하고 인터페이스 변수에 대입
    rc = new Television();  // 인터페이스로 Television 객체 사용
    rc.turnOn();
    rc.setVolume(5);
    rc.turnOff();
    /*
    TV를 켭니다.
    현재 TV 볼륨: 5
    TV를 끕니다.
     */

    // Audio 객체를 생성하고 인터페이스 변수에 대입
    rc = new Audio();       // 인터페이스로 Audio 객체 사용
    rc.turnOn();
    rc.setVolume(5);
    rc.turnOff();
    /*
    Audio를 켭니다.
    현재 Audio 볼륨: 5
    Audio를 끕니다.
     */
  }
}
