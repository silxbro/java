package thisisjava.ch13.sec02.exam02;

public class GenericExample {
  public static void main(String[] args) {
    HomeAgency homeAgency = new HomeAgency();
    Home home = homeAgency.rent();
    home.turnOnLight();
    // 전등을 켭니다.

    CarAgency carAgency = new CarAgency();
    Car car = carAgency.rent();
    car.run();
    // 자동차가 달립니다.
  }
}
