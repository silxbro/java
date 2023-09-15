# while 문
<br/>

for 문이 정해진 횟수만큼 반복한다면, **`while 문`** 은 조건식이 `true`일 경우에 **계속해서 반복**하고, `false`가 되면 **반복을 멈추고 while 문을 종료**한다.
다음은 while 문의 실행 흐름을 보여준다.

<img src="https://github.com/silxbro/java/assets/142463332/78d2c48e-7b33-45ad-af32-d6cf06b31d82" width="450" height="250"/>

while 문이 처음 실행될 때 ① 조건식을 평가한다. 평가 결과가 true이면 ② 실행문을 실행한다. ② 실행문이 모두 실행되면 조건식으로 되돌아가서 ① 조건식을 다시 평가한다.
다시 조건식이 true라면 ② → ① 로 진행하고, false라면 while 문을 종료한다.<br/>

다음 예제는 while 문으로 1부터 10까지 출력한다. 한 번 실행할 때 i 값을 출력하고 i를 1 증가시킨다. 조건문은 i가 10 이하일 때까지 true가 되므로 while 문은 총 10번을 반복 실행한다.
- [PrintFrom1To10Example.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec05/PrintFrom1To10Example.java)<br/>

다음 예제는 1부터 100까지 합을 구하기 위해 while 문을 사용한다. while 문 내에서 계속 누적되는 값을 갖는 sum 변수는 while 문 시작 전에 미리 선언해 놓아야 한다.
- [SumFrom1To10Example.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec05/SumFrom1To100Example.java)<br/>

만약 조건식에 true를 사용하면 while(true){...}가 되어서 무한 반복하게 된다. 이 경우, 언젠가는 while 문을 빠져나가기 위한 코드가 필요하다.<br/>

다음은 키보드에서 1,2를 입력했을 때 속도를 증속, 감속시키고, 3을 입력하면 프로그램을 종료시키는 예제이다.
- [KeyControlExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec05/KeyControlExample.java)<br/>
  - 실행 결과 :<br/>
    <img src="https://github.com/silxbro/java/assets/142463332/80bbca4f-c83f-4f3f-9787-af57121b6859" width="200" height="250"/>
