package thisisjava.ch07.sec10.exam01;

public class PhoneExample {
  public static void main(String[] args) {
    //Phone phone = new Phone("홍길동");
    
    SmartPhone smartPhone = new SmartPhone("홍길동");
    
    smartPhone.turnOn();  // Phone의 메소드
    smartPhone.internetSearch();
    smartPhone.turnOff(); // Phone의 메소드

    /*
    폰 전원을 켭니다.
    인터넷 검색을 합니다.
    폰 전원을 끕니다.
     */
  }
}
