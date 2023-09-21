package thisisjava.ch08.sec12;

public class InstanceofExample {
  public static void main(String[] args) {
    // 구현 객체 생성
    Taxi taxi = new Taxi();
    Bus bus = new Bus();

    // ride() 메소드 호출 시 구현 객체를 매개값으로 전달
    ride(taxi);
    System.out.println();
    ride(bus);

    /*
    택시가 달립니다.

    승차요금을 체크합니다.
    버스가 달립니다.
     */
  }

  // 인터페이스 매개변수를 갖는 메소드
  public static void ride(Vehicle vehicle) {
    // 방법1
    /*
    if (vehicle instanceof Bus) {   // 매개값이 Bus인 경우에만 강제 타입 변환해서 checkFare() 메소드를 호출
      Bus bus = (Bus) vehicle;
      bus.checkFare();
    }
     */


    // 방법2
    if (vehicle instanceof Bus bus) {  // Java12 부터 사용 가능
      bus.checkFare();
    }

    vehicle.run();
  }
}
