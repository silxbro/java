package thisisjava.ch09.sec06.exam02;

public class Button {
  // 정적 멤버 인터페이스
  public static interface ClickListener {
    // 추상 메소드
    void onClick();
  }
// 중첩 인터페이스 타입으로 필드와 Setter 선언

  // 필드
  private ClickListener clickListener;

  // 메소드
  public void setClickListener(ClickListener clickListener) { // ClickListener 구현 객체
    this.clickListener = clickListener;
  }

  public void click() {  // Button이 클릭되었을 때 실행하는 메소드 선언
    this.clickListener.onClick();      // ClickListener 구현 객체의 onClick() 메소드 실행
  }
}
