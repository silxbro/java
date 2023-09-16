# 배열(Array) 타입
<br/>

변수는 하나의 값만 저장할 수 있다. 따라서 저장해야 할 값의 수가 많아지면 그만큼 많은 변수가 필요하다.<br/>
따라서 많은 양의 값을 다루는 좀 더 효율적인 방법이 필요한데, 이것이 **`배열`** 이다. 배열은 **연속된 공간에 값을 나열시키고, 각 값에 `인덱스(index)`를 부여해 놓은 자료구조**이다.<br/>
학생들의 성적은 다음과 같이 score 배열로 생성할 수 있다.<br/>

<img src="https://github.com/silxbro/java/assets/142463332/90da7981-f864-4db8-a73b-4445ac5cdbb7" width="350" height="100"/>

인덱스는 `대괄호 []`와 함께 사용하여 각 항목의 값을 읽거나 저장하는 데 사용된다. 예를 들어 score[0]은 83, score[1]은 90, score[2]는 87 값을 가진다. 이렇게 성적을 배열에 저장하면
평균 값은 배열의 인덱스를 이용해서 **for 문**으로 쉽게 구할 수 있다.
```java
int sum = 0;
for (int i=0; i<30; i++) {
  sum += score[i];
}
int avg = sum / 30;
```
for 문이 30번 반복 실행하면서 i는 0~29까지 변한다. 따라서 sum 변수에는 score[0]~score[29]까지의 값이 더해지고, 마지막으로 얻은 sum을 배열의 길이 30으로 나누면 평균 avg를 얻을 수 있다.
이렇게 하면 학생 수가 30명이 아니라 수백 명이 되어도 for 문의 i<30만 변경하면 되므로 많은 양의 데이터를 적은 코드로 손쉽게 처리할 수 있다.<br/>

배열은 다음과 같은 특징을 가지고 있다.
- **배열은 같은 타입의 값만 관리한다.**
- **배열의 길이는 늘리거나 줄일 수 없다.**
  <br/>
  
int 배열은 int 타입의 값만 관리하고, String 배열은 문자열만 관리한다. 배열은 **생성과 동시에 길이가 결정**된다. 또한 한 번 결정된 배열의 길이는 늘리거나 줄일 수 없다.
<br/>
<br/>

## 배열 변수 선언
배열을 사용하기 위해서는 우선 배열 변수를 선언해야 한다. 배열 변수 선언은 다음과 같이 두 가지 형태로 작성할 수 있지만, 관례적으로 첫 번째 방법을 주로 사용한다.
```java
타입[] 변수;
```
```java
타입 변수[];
```
타입은 배열에 저장될 값의 타입을 말하는데, 다음은 타입별로 배열을 선언하는 방법이다.
```java
int[] intArray;
double[] doubleArray;
String[] strArray;
```
```java
int intArray[];
double doubleArray[];
String strArray[];
```
배열 변수는 **참조 변수**이다. 배열도 객체이므로 힙 영역에 생성되고 배열 변수는 힙 영역의 배열 주소를 저장한다. 참조할 배열이 없다면 배열 변수도 null로 초기화할 수 있다.
```java
타입[] 변수 = null;
```
만약 배열 변수가 null 값을 가진 상태에서 변수[인덱스]로 값을 읽거나 저장하게 되면 `NullPointerException`이 발생한다.
<br/>
<br/>

## 값 목록으로 배열 생성
배열에 저장될 값의 목록이 있다면, 다음과 같이 간단하게 배열을 생성할 수 있다.
```java
타입[] 변수 = { 값0, 값1, 값2, 값3, ... };
```
<img src="https://github.com/silxbro/java/assets/142463332/9c4c4a0b-e77b-418e-b10e-8a4e557bd432" width="400" height="100"/>

중괄호 {}는 나열된 값들을 항목으로 가지는 배열을 힙에 생성하고, **번지를 리턴**한다. 배열 변수는 리턴된 번지를 저장함으로써 참조가 이루어진다.<br/>

**(example)** "Spring", "Summer", "Fall", "Winter" 문자열을 갖는 배열은 다음과 같이 생성할 수 있다.
- ```java
  String[] season = { "Sprint", "Summer", "Fall", "Winter" };
  ```
  - 이렇게 생성된 배열에서 "Spring"은 season[0], "Fall"은 season[2]로 읽을 수 있다. season[1]의 "Summer"을 "여름"으로 바꾸고 싶다면 다음과 같이 대입 연산자를 사용하면 된다.
    ```java
    season[1] = "여름";
    ```
    <br/>
- [ArrayCreateByValueListExample1.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec06/ArrayCreateByValueListExample1.java)
<br/>

중괄호 {}로 감싼 목록을 배열 변수에 대입할 때 주의할 점이 있다. **배열 변수를 미리 선언한 후에는 값 목록을 변수에 대입할 수 없다.**
```java
타입[] 변수;
변수 = { 값0, 값1, 값2, 값3, ...};    // 컴파일 에러
```
**배열 변수를 선언한 시점과 값 목록이 대입되는 시점이 다르다면** 다음과 같이 `new 타입[]`을 중괄호 앞에 붙여주면 된다. 타입은 배열 변수를 선언할 때 사용한 타입과 동일하게 주면 된다.
```java
변수 = new 타입[] { 값0, 값1, 값2, 값3, ... };
```
**(example)** String 배열 변수 names를 선언한 후에 값 목록을 대입할 경우에는 new String[]을 중괄호 앞에 붙여줘야 한다.
- ```java
  String[] names = null;
  names = new String[] { "신용권", "홍길동", "김자바" };
  ```

**메소드의 매개변수가 배열 타입일 경우**에도 마찬가지다.<br/>
아래와 같이 매개변수로 int[] 배열 타입을 갖는 printItem() 메소드가 있다고 가정해보자. printItem() 메소드를 호출할 때 매개값으로 중괄호로 감싼 값 목록을 주면 컴파일 에러가 발생한다.
```java
// 메소드 선언
void printItem(int[] scores) { ... }

// 잘못된 메소드 호출
printItem( { 95, 85, 90 } );    // 컴파일 에러
```
매개변수가 이미 선언되어 있고, 호출 시 값 목록을 제공하므로 다음과 같이 호출해야 한다.
```java
// 올바른 메소드 호출
printItem( new int[] { 95, 85, 90 } );
```
- [ArrayCreateByValueListExample2.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec06/ArrayCreateByValueListExample2.java)
<br/>

## new 연산자로 배열 생성
값의 목록은 없지만 향후 값들을 저장할 목적으로 배열을 미리 생성할 수도 있다. `new` 연산자를 다음과 같이 사용하면 배열 객체를 생성시킨다.
**길이**는 배열이 저장할 수 있는 항목 수를 말한다.
```java
타입[] 변수 = new 타입[길이];
```
new 연산자는 **해당 길이의 배열을 생성하고 배열의 번지를 리턴**하기 때문에 배열 변수에 대입할 수 있다. 이미 **배열 변수가 선언된 후**에도 다음과 같이 **대입이 가능**하다.
```java
타입[] 변수 = null;
변수 = new 타입[길이];
```
**(example)** 다음은 길이 5인 int[] 배열을 생성하고, 배열 번지를 intArray 변수에 대입한다.
- ```java
  int[] int Array = new int[5];
  ```

new 연산자로 배열을 처음 생성하면 배열 항목은 **기본값으로 초기화**된다. 다음 표는 타입별 배열의 초기값을 보여준다.
|데이터 타입|초기값|
|:---|:---|
|**[기본 타입]**<br/>byte[]<br/>char[]<br/>short[]<br/>int[]<br/>long[]<br/>float[]<br/>double<br/>boolean[]|<br/>0<br/>'\u0000'&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>0<br/>0<br/>0L<br/>0.0F<br/>0.0<br/>false|
|**[참조 타입]**<br/>클래스[]<br/>인터페이스[]&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|<br/>null<br/>null|
- 정수 배열은 `0`, 실수 배열은 `0.0`, 논리 배열은 `false`, 참조 배열은 `null`로 초기화된다.<br/>
**(example)** int[] 배열을 다음과 같이 생성했다면 항목은 모두 0으로 초기화된다.
- ```java
  int[] scores = new int[30];
  ```
  <img src="https://github.com/silxbro/java/assets/142463332/065d9b65-b257-4eea-9be6-fc30d517b332" width="400" height="50"/>
**(example)** String[] 배열을 다음과 같이 생성했다면 항목은 모두 null로 초기화된다.
- ```java
  String[] names = new String[30];
  ```
  <img src="https://github.com/silxbro/java/assets/142463332/f206b177-77fe-4e37-855b-59b1c871fb28" width="400" height="50"/>
<br/>

배열을 생성하고 난 후 특정 인덱스 항목을 새로운 값으로 변경하는 방법은 동일하다.
```java
변수[인덱스] = 값;
```
- [ArrayCreateByNewExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec06/ArrayCreateByNewExample.java)
<br/>

## 배열 길이
배열의 길이란 배열에 저장할 수 있는 항목 수를 말한다. 코드에서 배열의 길이를 얻으려면 `도트(.)` 연산자를 사용해서 참조하는 배열의 **`length` 필드**를 읽으면 된다.
```java
배열변수.length;
```
배열의 length 필드는 읽기만 가능하므로 다음과 같이 **값을 변경할 수는 없다**.
```java
intArray.length = 10;    // 컴파일 에러 발생
```
배열 길이는 **for 문을 사용해서 전체 배열 항목을 반복할 때 많이 사용**된다.
- [ArrayLengthExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec06/ArrayLengthExample.java)
- for 문의 조건식에서 **`<`** 연산자를 사용한 이유는 배열의 마지막 인덱스는 배열 길이보다 1이 적기 때문이다.
  인덱스를 초과해서 사용하면 `ArrayIndexOutOfBoundsException`이 발생한다.
