package thisisjava.ch19.sec03.exam01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
  public static void main(String[] args) {
    try {
      // Socket 생성과 동시에 localhost의 50001 Port로 연결 요청
      Socket socket = new Socket("localhost", 50001);

      System.out.println("[클라이언트] 연결 성공");

      // Socket 닫기
      socket.close();
      System.out.println("[클라이언트] 연결 끊음");
    } catch (UnknownHostException e) {
      // IP 표기 방법이 잘못되었을 경우
    } catch (IOException e) {
      // 해당 포트의 서버에 연결할 수 없는 경우
    }
    /*
    ServerExample을 먼저 실행시키고 ClientExample을 실행하면 다음과 같은 내용이 Console 뷰에 출력된다.

    [ServerExample 실행 결과 (먼저 실행되어 있어야 함)]
    --------------------------------------------------------
    서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.
    --------------------------------------------------------
    [서버] 시작됨

    [서버] 연결 요청을 기다림

    [서버] view-localhost의 연결 요청을 수락함
    [서버] view-localhost의 연결을 끊음

    [서버] 연결 요청을 기다림

    [ClientExample 실행 결과]
    [클라이언트] 연결 성공
    [클라이언트] 연결 끊음
     */
  }
}
