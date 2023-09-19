package thisisjava.ch07.sec02;

public class SmartPhoneExample {
  public static void main(String[] args) {
    // SmartPhone 객체 생성
    SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

    // Phone으로부터 상속받은 필드 읽기
    System.out.println("모델: " + myPhone.model);         // 모델: 갤럭시
    System.out.println("색상: " + myPhone.color);         // 색상: 은색

    // SmartPhone의 필드 읽기
    System.out.println("와이파이 상태: " + myPhone.wifi);  // 와이파이 상태: false

    // Phone으로부터 상속받은 메소드 호출
    myPhone.bell();
    myPhone.sendVoice("여보세요.");
    myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
    myPhone.sendVoice("아~ 네, 반갑습니다.");
    myPhone.hangUp();
    /*
    벨이 울립니다.
    자기: 여보세요.
    상대방: 안녕하세요! 저는 홍길동인데요.
    자기: 아~ 네, 반갑습니다.
    전화를 끊습니다.
     */

    // SmartPhone의 메소드 호출
    myPhone.setWifi(true);
    myPhone.internet();
    /*
    와이파이 상태를 변경했습니다.
    인터넷에 연결합니다.
     */
  }
}
