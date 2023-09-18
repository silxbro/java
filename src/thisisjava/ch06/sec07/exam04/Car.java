package thisisjava.ch06.sec07.exam04;

public class Car {
  // 필드 선언
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

  // 생성자 선언
  Car() {}                                           // ① 생성자

  Car(String model) {                                // ② 생성자
    this.model = model;
  }

  Car(String model, String color) {                  // ③ 생성자
    this.model = model;
    this.color = color;
  }

  Car(String model, String color, int maxSpeed) {    // ④ 생성자
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}
