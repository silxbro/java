# 열거(Enum) 타입
<br/>

데이터 중에는 몇 가지로 한정된 값을 갖는 경우가 있다. 예를 들어 요일은 월, 화, 수, 목, 금, 토, 일이라는 7개의 값을, 계절은 봄, 여름, 가을, 겨울이라는 4개의 값을 가진다.
이와 같이 **한정된 값을 갖는 타입**을 **`열거 타입(enumeration type)`** 이라고 한다.<br/>

열거 타입을 사용하기 위해서는 먼저 열거 타입 이름으로 소스 파일(.java)을 생성하고 한정된 값을 코드로 정의해야 한다. 열거 타입 이름은 **첫 문자를 대문자**로 하고 다음과 같이
**캐멀(camel) 스타일**로 지어주는 것이 관례이다.
```java
Week.java
MemberGrade.java
ProductKind.java
```
요일을 저장할 수 있는 열거 타입인 Weeks를 intelliJ에서 생성해보자.

1. 먼저 ch05.sec12 패키지를 생성 및 선택한 후 마우스 오른쪽 버튼을 클릭하여 [New] - [Java Class] - [Enum]을 선택한 후, New Java Class 대화상자에서 Name 입력란에 'Week'라고
   입력하고 [Enter]를 입력한다.<br/>

   <img src="https://github.com/silxbro/java/assets/142463332/107f357a-95c9-44d1-b101-d96e68ea51d0" width="450" height="250"/>

2. 요일 값은 7개이므로 다음과 같이 열거 상수 목록을 작성한다.

   <img src="https://github.com/silxbro/java/assets/142463332/6ec35dda-743f-40da-b6a5-f4cadac805ec" width="550" height="350"/>
<br/>

**`열거 상수`** 는 **열거 타입으로 사용할 수 있는 한정된 값**을 말한다. 관례적으로 **알파벳**으로 정의하며, **모두 대문자**로 작성한다.
만약 열거 상수가 여러 단어로 구성될 경우에는 다음과 같이 단어와 단어 사이를 **언더바(_)로 연결**하는 것이 관례이다.
```java
public enum LoginResult {
  LOGIN_SUCCESS,
  LOGIN_FAILED
}
```
<br/>

열거 타입도 하나의 데이터 타입이므로 **변수를 선언하고 사용**해야 한다.<br/>
**(example)** 열거 타입 Week로 변수를 선언하면 다음과 같다.
- ```java
  Week today;
  Week reservationDay;
  ```
<br/>

열거 타입 변수에는 **열거 상수를 대입**할 수 있는데, **'열거타입.열거상수'** 형태로 작성한다.<br/>
**(example)** Week 변수에 열거 상수인 SUNDAY를 대입하는 코드는 다음과 같다.
- ```java
  Week today = Week.SUNDAY;
  ```
열거 타입은 **참조 타입**이므로 Week 변수에 다음과 같이 `null`도 대입할 수 있다.
- ```java
  Week birthday = null;
  ```
<br/>

열거 변수의 값이 특정 열거 상수인지 비교할 때는 `==`와 '!=` 연산자를 사용한다.<br/>
**(example)** Week 변수값이 SUNDAY인지 비교하는 코드는 다음과 같다.
- ```java
  Week today = Week.SUNDAY;
  today == Week.SUNDAY;    // 결과: true
  ```
<br/>

컴퓨터의 날짜 및 요일, 시간을 얻을 때는 열거 타입 **`Calendar`** 를 이용한다. Calendar를 이용하여 오늘의 연, 월, 일, 요일, 시간, 분, 초를 다음과 같이 얻을 수 있다.
```java
Calender now = Calendar.getInstance();         // Calender 객체 얻기
int year     = now.get(Calendar.YEAR);         // 연
int month    = now.get(Calendar.MONTH) + 1;    // 월
int day      = now.get(Calendar.DAY_OF_MONTH); // 일
int week     = now.get(Calendar.DAY_OF_WEEK);  // 요일(1-7)
int hour     = now.get(Calendar.HOUR);         // 시간
int minute   = now.get(Calendar.MINUTE);       // 분
int second   = now.get(Calendar.SECOND);       // 초
```
다음은 Calendar를 이용해서 오늘의 요일을 얻는 예제이다. 요일은 1~7 사이의 숫자이므로 코드 가독성을 위해 열거 상수로 변환해서 Week 변수에 대입하고 사용하는 방법을 보여준다.
- [WeekExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec12/WeekExample.java)
