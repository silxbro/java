package thisisjava.ch12.sec11.exam01;

public class GetClassExample {
  public static void main(String[] args) throws Exception {
    // how1
    Class clazz = Car.class;

    // how2
    //Class clazz = Class.forName("thisisjava.ch12.sec11.exam01.Car");

    // how3
    //Car car = new Car();
    //Class clazz = car.getClass();

    System.out.println("패키지: " + clazz.getPackage().getName());    // 패키지: thisisjava.ch12.sec11.exam01
    System.out.println("클래스 간단 이름: " + clazz.getSimpleName());  // 클래스 간단 이름: Car
    System.out.println("클래스 전체 이름: " + clazz.getName());        // 클래스 전체 이름: thisisjava.ch12.sec11.exam01.Car
  }
}
