package thisisjava.ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
  public static void main(String[] args) {
    // 선택번호
    int[] selectNumber = new int[6];  // 선택번호 6개가 저장될 배열 생성
    Random random = new Random(3);     // 선택번호를 얻기 위한 Random 객체 생성
    System.out.print("선택번호: ");
    for (int i=0; i<6; i++) {         // 선택번호 6개를 얻어 배열에 저장
      selectNumber[i] = random.nextInt(45) + 1;
      System.out.print(selectNumber[i] + " ");
    }
    System.out.println();

    // 당첨번호
    int[] winningNumber = new int[6]; // 당첨번호 6개가 저장될 배열 생성
    random = new Random(5);     // 당첨번호를 얻기 위한 Random 객체 생성
    System.out.print("당첨 번호: ");
    for (int i=0; i<6; i++) {         // 당첨번호 6개를 얻어 배열에 저장
      winningNumber[i] = random.nextInt(45) + 1;
      System.out.print(winningNumber[i] + " ");
    }
    System.out.println();

    // 당첨여부
    // 비교하기 전에 배열 항목을 정렬시킴
    Arrays.sort(selectNumber);
    Arrays.sort(winningNumber);
    boolean result = Arrays.equals(selectNumber, winningNumber); // 배열 항목 비교하기
    System.out.print("당첨여부: ");
    if (result) {
      System.out.print("1등에 당첨되셨습니다.");
    } else {
      System.out.print("당첨되지 않았습니다.");
    }

    /*
    선택번호: 15 21 16 17 34 28
    당첨 번호: 18 38 45 15 22 36
    당첨여부: 당첨되지 않았습니다.
     */

    /*
    선택번호 6개를 얻기 위해 Random 객체의 종자값으로 3을 주었고, 당첨번호 6개를 얻기 위해 Random 객체의 종자값으로 5를 주었다.
    서로 다른 종자값을 주었기 때문에 선택번호와 당첨번호는 다르게 나온다.
    만약 종자값을 동일하게 주면 동일한 난수를 얻기 때문에 선택번호와 당첨번호는 같게 나온다.
     */
  }
}
