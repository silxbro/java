# null과 NullPointerException
<br/>

참조 타입 변수는 **아직 번지를 저장하고 있지 않다는 뜻**으로 **`null(널)`** 값을 가질 수 있다. null도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에
생성된다.
```java
String refVar1 = "자바"
String refVar2 = null;
```
<img src="https://github.com/silxbro/java/assets/142463332/79716576-95dd-4865-a944-5c49cc0b6ab8" width="400" height="150"/>

참조 타입 변수가 **null 값을 가지는지 확인**하려면 다음과 같이 `==, !=` 연산을 수행할 수 있다.
```java
refVar1 == null    // 결과: false;
refVar1 != null    // 결과: true;
```
```java
refVar2 == null    // 결과: true
refVar2 != null    // 결과: false
```
<br/>

자바는 **프로그램 실행 도중에 발생하는 오류**를 **`예외(Exception)`** 라고 부른다. 참조 변수를 사용하면서 가장 많이 발생하는 예외 중 하나는 **`NullPointerException`** 이다.
**변수가 null인 상태에서 객체의 데이터나 메소드를 사용하려 할 때** 이 예외가 발생한다. 다음 코드를 보자.
```java
int[] intArray = null;
intArray[0] = 10;  // NullPointerException
```
배열 변수 intArray에 null을 대입한 상태에서 배열 객체의 0 인덱스 항목에 10을 대입하는 코드(intArray[0] = 10)을 실행하면 NullPointerException이 발생한다.
이유는 intArray가 참조하는 배열 객체가 없으므로 10을 저장할 수 없기 때문이다. 다음 코드도 보자.
```java
String str = null;
System.out.println("총 문자 수: " + str.length());   // NullPointerException
```
str 변수에 null을 대입한 상태에서 문자열의 길이를 얻기 위해 length() 메소드를 호출하면 NullPointerException이 발생한다. 이유는 str 변수가 참조하는 String 객체가 없으므로
문자열의 길이를 구할 수 없기 때문이다.<br/>

다음 예제에서 6라인과 9라인을 번갈아가며 주석 처리하고 실행해보면 NullPointerException이 발생하는 것을 알 수 있다.
- [NullPointerExceptionExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec04/NullPointerExceptionExample.java)

앞으로 NullPointerException이 발생하면 예외가 발생된 곳에서 **null인 상태의 참조 변수가 사용되고 있음**을 알아야 한다. 이것을 해결하려면 참조 변수가 객체를 정확히 참조하도록
번지를 대입해야 한다.<br/>
<br/>

경우에 따라서는 참조 타입 변수에 **일부러 null을 대입**하기도 한다. 프로그램에서 객체를 사용하려면 해당 객체를 참조하는 변수를 이용해야 하는데, 변수에 null을 대입하면 번지를 잃게
되므로 더 이상 객체를 사용할 수 없게 된다.
```java
String hobby = "여행";
hobby = null;
```
어떤 변수에서도 객체를 참조하지 않으면 해당 객체는 프로그램에서 사용할 수 없는 객체가 된다. 즉 힙 메모리에는 있지만, 위치 정보를 모르기 때문에 사용할 수 없게 된다. 자바는 이러한
객체를 쓰레기로 취급하고, `쓰레기 수집기(Garbage Collector)`를 실행시켜 **자동으로 제거**한다.<br/>
사실 자바는 코드를 이용해서 객체를 직접 제거하는 방법을 제공하지 않는다. **객체를 제거하는 유일한 방법은 객체의 모든 참조를 없애는 것이다**.<br/>

다음 코드에서 "여행"에 해당하는 String 객체는 쓰레기가 된다. hobby 변수에 "영화"가 대입되면서 다른 String 객체의 번지가 대입되어 이전 번지를 잃어버리기 때문이다.
```java
String hobby = "여행";
hobby = "영화";
```
<img src="https://github.com/silxbro/java/assets/142463332/b8a072c7-66a5-4436-98f3-382c04bcd195" width="450" height="220"/>

- [GarbageObjectExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec04/GarbageObjectExample.java)
