# 나눗셈 연산 후 NaN과 Infinity 처리
<br/>

나눗셈(/) 또는 나머지(%) 연산에서 좌측 피연산자가 **정수**이고 **우측 피연산자가 0**일 경우 **예외**(`ArithmeticException`)가 발생한다. 무한대의 값을 정수로 표현할 수 없기 때문이다.
```java
int x = 5;
int y = 0;
int result = x / y;    // 예외 발생
```
하지만 좌측 피연산자가 **실수**이거나 **우측 피연산자가 0.0 또는 0.0f**이면 예외가 발생하지 않고 연산의 결과는 `Infinity(무한대)` 또는 `NaN(Not a Number)`이 된다.
```java
5 / 0.0  → Infinity
5 % 0.0  → NaN
```
Infinity 또는 NaN 상태에서 계속해서 연산을 수행하면 안된다. 어떤 연산을 하더라도 결과는 계속해서 Infinity와 NaN이 되므로 데이터가 엉망이 될 수 있다.
```java
Infinity + 2  → Infinity
NaN + 2       → NaN
```
그렇기 때문에 /와 % 연산의 결과가 Infinity 또는 NaN인지 먼저 확인하고 다음 연산을 수행하는 것이 좋다. 확인하기 위해서는 `Double.isInfinite()`와 `Double.isNaN()`를 사용한다.
이렇게 하면 변수값이 Infinity 또는 NaN일 경우 true를, 그렇지 않다면 false를 산출한다.
```java
boolean result = Double.isInfinite(변수);
boolean result = Double.isNaN(변수);
```
다음 예제에서 7라인과 8라인을 번갈아가며 주석 처리하며 실행해보자.
- [InfinityAndNaNCheckExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch03/sec05/InfinityAndNaNCheckExample.java)
