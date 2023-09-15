# switch 문
<br/>

if 문은 조건식의 결과가 true, false 두 가지밖에 없기 때문에 경우의 수가 많아질수록 else if 를 반복적으로 추가해야 하므로 코드가 복잡해진다.
그러나 **`switch 문`** 은 **변수의 값**에 따라서 실행문이 결정되기 때문에 같은 기능의 if 문보다 코드가 **간결**해진다. 다음은 switch 문의 실행 흐름을 도식화한 것이다.

<img src="https://github.com/silxbro/java/assets/142463332/3ab12edb-2b5a-4185-98a2-cd582550cb8c" width="400" height="300"/>

switch 문은 괄호 안의 변수값에 따라 해당 `case`로 가서 실행문을 실행시킨다. 만약 변수값과 동일한 값을 갖는 case가 없으면 `defalut`로 가서 실행문을 실행시킨다.
defalut가 필요 없다면 생략 가능하다.
- [SwitchExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec03/SwitchExample.java)

case 끝에 있는 `break`는 **다음 case를 실행하지 않고 switch 문을 빠져나가기 위해** 필요하다.
**만약 break가 없다면** 다음 case가 연달아 실행되는데, 이때는 **case 값과는 상관없이 실행**된다.
- [SwitchNoBreakCaseExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec03/SwitchNoBreakCaseExample.java)

switch 문의 괄호에는 `정수 타입(byte, char, short, int, long)`가 `문자열 타입(String)` 변수를 사용할 수 있다.<br/>

다음은 char 타입 변수를 이용해서 영어 대소문자에 관계없이 똑같이 처리하는 예제이다.
- [SwitchCharExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec03/SwitchCharExample.java)

Java 12 이후부터는 switch 문에서 **Expressions(표현식)을 사용**할 수 있다. break 문을 없애는 대신에 화살표와 중괄호를 사용해 가독성이 좋아졌다.

다음은 앞의 예제를 Switch Expressions으로 다시 작성한 것이다.
- [SwitchExpressionsExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec03/SwitchExpressionsExample.java)

Switch Expressions을 사용하면 스위치된 값을 **변수에 바로 대입**할 수 있다. 단일 값일 경우에는 화살표 오른쪽에 값을 기술하면 되고, 중괄호를 사용할 경우에는 `yield`(Java 13부터 사용 가능)
키워드로 값을 지정하면 된다. 단, 이 경우에는 **default가 반드시 존재**해야 한다.
```java
타입 변수 = switch(grade) {
  case "값1" -> 변수값;
  case "값2" -> {
    ...;
    yield 변수값;
  }
  default -> 변수값;
};
```
다음은 grade에 따라 스위치된 점수를 score 변수에 대입하는 예제이다.
- [SwitchValueExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec03/SwitchValueExample.java)
