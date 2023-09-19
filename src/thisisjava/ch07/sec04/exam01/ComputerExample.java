package thisisjava.ch07.sec04.exam01;

import thisisjava.ch06.sec13.exam03.package2.C;

public class ComputerExample {
  public static void main(String[] args) {
    int r = 10;

    Calculator calculator = new Calculator();
    System.out.println("원 면적: " + calculator.areaCircle(r));
    System.out.println();

    Computer computer = new Computer();
    System.out.println("원 면적: " + computer.areaCircle(r));

    /*
    Calculator 객체의 areaCircle() 실행
    원 면적: 314.159

    Computer 객체의 areaCircle() 실행
    원 면적: 314.1592653589793
     */
  }
}
