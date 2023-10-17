package thisisjava.ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLineExample {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(  // FileReader에 BufferedReader 보조 스트림 연결
        new FileReader("src/thisisjava/ch18/sec07/exam02/ReadLineExample.java")
    );

    int lineNo = 1;
    while (true) {
      String str = br.readLine();  // 1행을 읽음
      if (str == null) break;      // 더 이상 읽을 내용이 없으면 while 문 종료
      System.out.println(lineNo + "\t" + str);
      lineNo++;
    }

    br.close();                    // BufferedReader를 닫으면 연결된 fileReader도 닫힘

    /*
    1	package thisisjava.ch18.sec07.exam02;
    2
    3	import java.io.BufferedReader;
    4	import java.io.FileReader;
    5
    6	public class ReadLineExample {
    7	  public static void main(String[] args) throws Exception {
    8	    BufferedReader br = new BufferedReader(  // FileReader에 BufferedReader 보조 스트림 연결
    9	        new FileReader("src/thisisjava/ch18/sec07/exam02/ReadLineExample.java")
    10	  );
    ...
    */
  }
}
