package thisisjava.ch06.sec12.hyundai;

// import 문으로 다른 패키지 클래스 사용을 명시
import thisisjava.ch06.sec12.hankook.SnowTire;
import thisisjava.ch06.sec12.kumho.AllSeasonTire;

public class Car {
  // 부품 필드 선언
  thisisjava.ch06.sec12.hankook.Tire tire1 = new thisisjava.ch06.sec12.hankook.Tire();
  thisisjava.ch06.sec12.kumho.Tire tire2 = new thisisjava.ch06.sec12.kumho.Tire();
  SnowTire tire3 = new SnowTire();
  AllSeasonTire tire4 = new AllSeasonTire();
}
