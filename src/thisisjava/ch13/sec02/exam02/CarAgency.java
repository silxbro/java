package thisisjava.ch13.sec02.exam02;

public class CarAgency implements Rentable<Car> {  // 타입 파라미터 P를 Car로 대체
  @Override
  public Car rent() {  // 리턴 타입이 반드시 Car이어야 함
    return new Car();
  }
}
