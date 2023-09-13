package thisisjava.ch02.sec12;

public class PrintfExample {
  public static void main(String[] args) {
    int value = 123;
    System.out.printf("상품의 가격: %d원\n", value);     // 상품의 가격: 123원
    System.out.printf("상품의 가격: %6d원\n", value);    // 상품의 가격:    123원
    System.out.printf("상품의 가격: %-6d원\n", value);   // 상품의 가격: 123   원
    System.out.printf("상품의 가격: %06d원\n", value);   // 상품의 가격: 000123원

    double area = 3.14159 * 10 * 10;
    System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);  // 반지름이 10인 원의 넓이:     314.16

    String name = "홍길동";
    String job = "도적";
    System.out.printf("%6d | %-10s | %10s\n", 1, name, job);         //      1 | 홍길동        |         도적
  }
}
