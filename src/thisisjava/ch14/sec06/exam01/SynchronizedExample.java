package thisisjava.ch14.sec06.exam01;

public class SynchronizedExample {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    User1Thread user1Thread = new User1Thread();
    user1Thread.setCalculator(calculator);
    user1Thread.start();

    User2Thread user2Thread = new User2Thread();
    user2Thread.setCalculator(calculator);
    user2Thread.start();

    /*
    User1Thread: 100
    User2Thread: 50
     */

    /*
    User1Thread는 Calculator의 동기화 메소드인 setMemory1()을 실행하는 순간 Calculator 객체를 잠근다.
    따라서 User2Thread는 객체가 잠금 해제될 때까지 Calculator의 동기화 블록을 실행하지 못한다.
    2초 일시 정지 후에 잠금이 해제되면 비로소 User2Thread가 동기화 블록을 실행한다.
     */
  }
}
