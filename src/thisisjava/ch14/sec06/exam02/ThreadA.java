package thisisjava.ch14.sec06.exam02;

public class ThreadA extends Thread {
  private WorkObject workObject;
  
  public ThreadA(WorkObject workObject) {  // 공유 작업 객체를 받음
    setName("ThreadA");                    // 스레드 이름 변경
    this.workObject = workObject;
  }
  
  @Override
  public void run() {
    for (int i=0; i<10; i++) {
      workObject.methodA();                // 동기화 메소드 호출
    }
  }
}
