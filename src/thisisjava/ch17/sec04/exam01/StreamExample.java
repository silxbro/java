package thisisjava.ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
  public static void main(String[] args) {
    // List 컬렉션 생성
    List<Product> list = new ArrayList<>();
    for (int i=1; i<=5; i++) {
      Product product = new Product(i, "상품"+i, "멋진 회사", (int)(10000*Math.random()));
      list.add(product);
    }

    // 객체 스트림 얻기
    Stream<Product> stream = list.stream();
    stream.forEach( p -> System.out.println(p));

    /*
    {pno:1, name:상품1, company:멋진 회사, price:2357}
    {pno:2, name:상품2, company:멋진 회사, price:4125}
    {pno:3, name:상품3, company:멋진 회사, price:1345}
    {pno:4, name:상품4, company:멋진 회사, price:746}
    {pno:5, name:상품5, company:멋진 회사, price:624}
     */
  }
}
