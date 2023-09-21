package thisisjava.ch09.sec06.exam03;

import thisisjava.ch09.sec06.exam02.Button;

public class ButtonExample {
  public static void main(String[] args) {
    // Ok 버튼 객체 생성
    Button btnOk = new Button();

    // Ok 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        // onClick() 메소드를 재정의해서 버튼이 클릭되었을 때 해야할 일 코딩
    class OkListener implements Button.ClickListener {
      @Override
      public void onClick() {
        System.out.println("Ok 버튼을 클릭했습니다.");
      }
    }

    // Ok 버튼 객체에 ClickListener 구현 객체 주입
        // 버튼이 클릭되었을 때 처리를 담당할 ClickListener 구현 객체를 설정
    btnOk.setClickListener(new OkListener());

    // Ok 버튼 클릭하기
    btnOk.click();     // Ok 버튼을 클릭했습니다.

    //----------------------------------------------------------------------

    // Cancel 버튼 객체 생성
    Button btnCancel = new Button();

    // Cancel 버튼 클릭 시 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스)
        // onClick() 메소드를 재정의해서 버튼이 클릭되었을 때 해야할 일 코딩
    class CancelListener implements Button.ClickListener {
      @Override
      public void onClick() {
        System.out.println("Cancel 버튼을 클릭했습니다.");
      }
    }

    // Cancel 버튼 객체에 ClickListener 구현 객체 주입
        // 버튼이 클릭되었을 때 처리를 담당할 ClickListener 구현 객체를 설정
    btnCancel.setClickListener(new CancelListener());

    // Cancel 버튼 클릭하기
    btnCancel.click(); // Cancel 버튼을 클릭했습니다.
  }
}
