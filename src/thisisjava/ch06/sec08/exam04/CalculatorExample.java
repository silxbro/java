package thisisjava.ch06.sec08.exam04;

public class CalculatorExample {
  public static void main(String[] args) {
    // 객체 생성
    Calculator myCalcu = new Calculator();

    // 정사각형의 넓이 구하기
    double result1 = myCalcu.areaRectangle(10);  // areaRectangle(double width) 실행

    // 직사각형의 넓이 구하기
    double result2 = myCalcu.areaRectangle(10, 20);  // areaRectangle(double width, double height) 실행

    System.out.println("정사각형 넓이 = " + result1);  // 정사각형 넓이 = 100.0
    System.out.println("직사각형 넓이 = " + result2);  // 직사각형 넓이 = 200.0
  }
}
