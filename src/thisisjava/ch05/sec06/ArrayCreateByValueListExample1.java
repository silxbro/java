package thisisjava.ch05.sec06;

public class ArrayCreateByValueListExample1 {
  public static void main(String[] args) {
    // 배열 변수 선언과 배열 생성
    String[] season = { "Spring", "Summer", "Fall", "Winter" };

    // 배열의 항목값 읽기
    System.out.println("season[0]: " + season[0]);  // season[0]: Spring
    System.out.println("season[1]: " + season[1]);  // season[1]: Summer
    System.out.println("season[2]: " + season[2]);  // season[2]: Fall
    System.out.println("season[3]: " + season[3]);  // season[3]: Winter

    // 인덱스 1번 항목의 값 변경
    season[1] = "여름";
    System.out.println("season[1]: " + season[1]);  // season[1]: 여름
    System.out.println();

    // 배열 변수 선언과 배열 생성
    int[] scores = { 83, 90, 87 };

    // 총합과 평균 구하기
    int sum = 0;
    for (int i=0; i<3; i++) {
      sum += scores[i];
    }
    System.out.println("총합: " + sum);  // 총합: 260
    double avg = (double) sum / 3;
    System.out.println("평균: " + avg);  // 평균: 86.66666666666667
  }
}
