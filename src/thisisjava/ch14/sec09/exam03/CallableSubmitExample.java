package thisisjava.ch14.sec09.exam03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableSubmitExample {
  public static void main(String[] args) {
    // ExecutorService 생성
    ExecutorService executorService = Executors.newFixedThreadPool(5);

    // 계산 작업 생성 및 처리 요청
    for (int i=1; i<=100; i++) {
      final int idx = i;
      Future<Integer> future = executorService.submit(new Callable<Integer>() {
        @Override
        public Integer call() throws Exception {
          int sum = 0;
          for (int i=1; i<=idx; i++) {
            sum += i;
          }
          Thread thread = Thread.currentThread();
          // 어떤 스레드가 계산 처리를 했는지 알 수 있도록 출력
          System.out.println("[" + thread.getName() + "] 1~" + idx + " 합 계산");
          return sum;  // 작업 처리 결과 리턴
        }
      });

      try {
        int result = future.get();  // Callable의 call() 메소드가 리턴한 값 얻기
        System.out.println("\t리턴값: " + result);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

    // ExecutorService 종료
    executorService.shutdown();

    /*
    ...
    [pool-1-thread-3] 1~98 합 계산
    	리턴값: 4851
    [pool-1-thread-4] 1~99 합 계산
    	리턴값: 4950
    [pool-1-thread-5] 1~100 합 계산
    	리턴값: 5050
     */
  }
}
