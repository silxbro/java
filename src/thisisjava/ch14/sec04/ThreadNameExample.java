package thisisjava.ch14.sec04;

public class ThreadNameExample {
  public static void main(String[] args) {
    Thread mainThread = Thread.currentThread();  // 이 코드를 실행하는 스레드 객체 참조 얻기
    System.out.println(mainThread.getName() + " 실행");
    
    for (int i=0; i<3; i++) {
      Thread threadA = new Thread() {
        @Override
        public void run() {
          System.out.println(getName() + " 실행"); // getName() 메소드는 Thread의 인스턴스 메소드로 스레드의 이름을 리턴
        }
      };
      threadA.start();
    }

    Thread chatThread = new Thread() {
      @Override
      public void run() {
        System.out.println(getName() + " 실행");
      }
    };
    chatThread.setName("chat-thread");
    chatThread.start();  // 작업 스레드 이름 변경

    /*
    main 실행
    Thread-1 실행
    Thread-0 실행
    Thread-2 실행
    chat-thread 실행
     */
  }
}
