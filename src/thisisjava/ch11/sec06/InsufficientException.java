package thisisjava.ch11.sec06;

public class InsufficientException extends Exception {  // 일반 예외로 선언
  // 두 개의 생성자 선언

  public InsufficientException() {
  }

  public InsufficientException(String message) {
    super(message);
  }

}
