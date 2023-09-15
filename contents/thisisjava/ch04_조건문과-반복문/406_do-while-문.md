# do-while 문
<br/>

do-while 문은 조건식에 의해 반복 실행한다는 점에서 while 문과 동일하다. while 문은 시작할 때부터 조건식을 평가하여 블록 내부를 실행할지 결정하지만,
경우에 따라서는 **블록 내부를 먼저실행시키고, 실행 결과에 따라서 반복 실행을 계속할지 결정**하는 경우도 있다. 이때 do-while 문을 사용한다.
다음은 **`do-while 문`** 의 실행 흐름을 보여준다.

<img src="https://github.com/silxbro/java/assets/142463332/b2a39112-1471-4855-885e-6fe54a359fa3" width="420" height="250"/>

작성 시 주의할 점은 **while() 뒤에 반드시 `세미콜론(;)`을 붙여야 한다**. do-while 문이 처음 실행될 때 ① 실행문을 우선 실행한다. ① 실행문이 모두 실행되면 ② 조건식을 평가하는데,
그 결과가 true이면 ① → ②와 같이 반복 실행을 하고, 조건식의 결과가 false이면 do-whie 문을 종료한다.

다음 예제는 키보드로 입력받은 내용을 조사하여 계속 반복할 것인지를 판단한다. 조건식은 키보드로 입력받은 이후에 평가되어야 하므로 우선 키보드로부터 입력된 내용을 받아야 한다.
- [DoWhileExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec06/DoWhileExample.java)
  - 실행 결과:<br/>
    <img src="https://github.com/silxbro/java/assets/142463332/1cc34d9b-8753-453d-b258-6ae3ab1f0ec2" width="300" height="200"/>
