package thisisjava.ch09.sec06.exam03;

public class Button {
  // 정적 멤버 인터페이스
  public static interface ClickListener {
    // 추상 메소드
    void onClick();
  }

  // 필드
  private ClickListener clickListener; // line14의 Setter를 통해 ClickListener 구현 객체의 참조를 가짐

  // 메소드
  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }

  public void click() {  // Button이 클릭되었을 때 실행하는 메소드 선언
    this.clickListener.onClick();      // ClickListener 구현 객체의 onClick() 메소드 실행
  }
}
