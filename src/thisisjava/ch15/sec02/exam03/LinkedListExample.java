package thisisjava.ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
  public static void main(String[] args) {
    // ArrayList 컬렉션 객체 생성
    List<String> list1 = new ArrayList<>();

    // LinkedList 컬렉션 객체 생성
    List<String> list2 = new LinkedList<>();

    // 시작 시간과 끝 시간을 저장할 변수 선언
    long startTime;
    long endTime;

    // ArrayList 컬렉션에 저장하는 시간 측정
    startTime = System.nanoTime();
    for (int i=0; i<10000; i++) {
      list1.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf( "%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime - startTime) ); // ArrayList 걸린 시간:   5277500 ns

    // LinkedList 컬렉션에 저장하는 시간 측정
    startTime = System.nanoTime();
    for (int i=0; i<10000; i++) {
      list2.add(0, String.valueOf(i));
    }
    endTime = System.nanoTime();
    System.out.printf( "%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime - startTime) ); // LinkedList 걸린 시간:   2164100 ns
  }
  /*
  실행 결과를 보면 LinkedList가 훨씬 빠른 성능을 낸다.
  ArrayList가 느린 이유는 0번 인덱스에 새로운 객체가 추가되면서 기존 객체의 인덱스를 한 칸씩 뒤로 미는 작업을 하기 때문이다.
   */
}
