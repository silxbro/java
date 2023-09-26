package thisisjava.ch14.sec06.exam01;

public class Calculator {
  private int memory;

  public int getMemory() {
    return memory;
  }

  public synchronized void setMemory1(int memory) {  // 동기화 메소드
    this.memory = memory;    // 메모리 값 저장
    try {
      Thread.sleep(2000);    // 2초간 일시 정지
    } catch (InterruptedException e) {}
    System.out.println(Thread.currentThread().getName() + ": " + this.memory);    // 메모리 값 읽기
  }

  public void setMemory2(int memory) {
    synchronized(this) {  // 동기화 블록
      this.memory = memory;  // 메모리 값 저장
      try {
        Thread.sleep(2000);  // 2초간 일시 정지
      } catch (InterruptedException e) {}
      System.out.println(Thread.currentThread().getName() + ": " + this.memory);  // 메모리 값 읽기
    }
  }

  // setMemory1()과 setMemory2()는 동일하게 매개값을 메모리에 저장하고, 2초간 일시 정지 후에 메모리값을 출력한다.
}
