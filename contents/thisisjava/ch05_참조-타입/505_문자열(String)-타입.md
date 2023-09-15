# 문자열(String) 타입
<br/>

자바의 문자열은 String 객체로 생성된다. 다음은 두 개의 String 변수 name과 hobby를 선언하고 문자열 리터럴을 대입한 것이다. name 변수와 hobby 변수에 문자열 리터럴이 대입되면
문자열은 String 객체로 생성되고, 객체의 번지가 각각 대입된다.
```java
String name;           // String 타입 변수 name 선언
name = "홍길동";       // name 변수에 문자열 대입
String hobby = "여행"; // String 타입 변수 hobby를 선언하고 문자열 대입
```
<img src="https://github.com/silxbro/java/assets/142463332/c28939f3-1fe2-4911-9e16-38ed966f2bed" width="350" height="220"/>

## 문자열 비교
자바는 문자열 **리터럴이 동일**하다면 **String 객체를 공유**하도록 설계되어 있다. 다음과 같이 name1과 name2 변수에 "홍길동"을 대입할 경우, name1과 name2 변수에는 동일한
String 객체의 번지가 저장된다.
```java
String name1 = "홍길동";
String name2 = "홍길동";
```
<img src="https://github.com/silxbro/java/assets/142463332/714176d7-dabf-491c-83bd-e54edc0dc6b3" width="350" height="130"/>

String 변수에 문자열 리터럴을 대입하는 것이 일반적이지만, new 연산자로 직접 String 객체를 생성하고 대입할 수도 있다.
`new` 연산자는 **새로운 객체를 만드는 연산자**로 `객체 생성 연산자`라고 한다.
```java
String name1 = new String("홍길동");
String name2 = new String("홍길동");
```
이 경우 name1과 name2 변수는 서로 **다른** String 객체의 번지를 가지게 된다.
  
<img src="https://github.com/silxbro/java/assets/142463332/3fcccfdf-4b48-4de5-a50c-124f69934f57" width="350" height="220"/>

그렇기 때문에 문자열 리터럴로 생성하느냐 new 연산자로 생성하느냐에 따라 비교 연산자의 결과가 달라질 수 있다.
```java
String name1 = "홍길동";
String name2 = "홍길동";
String name3 = new String("홍길동");
```
- name1과 name2는 동일한 문자열 리터럴로 생성된 객체를 참조하기 때문에 name1 == name2의 결과는 true가 나오지만, name3은 new 연산자로 String 객체를 별도로 생성했기 때문에
  name2 == name3의 결과는 false가 나온다.
  ```java
  name1 == name2    // 결과: true
  name2 == name3    // 결과: false
  ```
  
동일한 String 객체든 다른 String 객체든 상관없이 **내부 문자열만을 비교**할 경우에는 String 객체의 **`equals()`** 메소드를 사용한다.
```java
boolean result = str1.equals(str2);      // 문자열이 같은지 검사(대소문자 구분)
                 원본        비교
boolean result = !str1.equals(str2);     // 문자열이 다른지 검사
```
- [EqaulsExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec05/EqualsExample.java)
  
String 변수에 `빈 문자열("")`을 대입할 수도 있다. 빈 문자열도 **String 객체로 생성**되기 때문에 변수가 빈 문자열을 참조하는지 조사하려면 다음과 같이 equals() 메소드를 사용해야 한다.
- [EmptyStringExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec05/EmptyStringExample.java)
<br/>

## 문자 추출
문자열에서 특정 위치의 문자를 얻고 싶다면 **`charAt()`** 메소드를 이용할 수 있다. charAt() 매소드는 **매개값으로 주어진 인덱스의 문자**를 리턴한다.
여기서 인덱스란 0에서부터 '문자열의 길이-1'까지의 번호를 말한다. 다음 코드를 보자.
```java
String subject = "자바 프로그래밍";
char charValue = subject.charAt(3);
```
- "자바 프로그래밍"이라는 문자열은 다음과 같이 인덱스를 매길 수 있다. 따라서 charAt(3) 은 3번 인덱스 위치에 있는 문자, 즉 '프'가 해당된다.<br/>
  <img src="https://github.com/silxbro/java/assets/142463332/ec41c498-ecb1-4699-94e8-6233a4d1a449" width="220" height="50"/>

다음 예제는 주민등록번호에서 성별에 해당하는 7번째 문자를 읽고 남자 또는 여자인지를 출력한다.
- [CharAtExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec05/CharAtExample.java)
<br/>

## 문자열 길이
문자열에서 **문자의 개수**를 얻고 싶다면 **`length()`** 메소드를 사용한다. 다음 코드를 보자.
```java
String subject = "자바 프로그래밍";
int length = subject.length();
```
- length 변수에는 8이 저장된다. subject 객체의 문자열 길이는 공백을 포함해서 8개이기 때문이다.<br/>
<br/>

- [LengthExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec05/LengthExample.java)
<br/>

## 문자열 대체
문자열에서 특정 문자열을 다른 문자열로 대체하고 싶다면 **`replace()`** 메소드를 사용한다. replace() 메소드는 기존 문자열은 그대로 두고, 대체한 새로운 문자열을 리턴한다.
다음 코드를 보자.
```java
String oldStr = "자바 프로그래밍";
String newStr = oldStr.replace("자바", "JAVA");
```
String 객체의 문자열은 **변경이 불가**한 특성을 갖기 때문에 replace() 메소드가 리턴하는 문자열은 원래 문자열의 수정본이 아니라 **완전히 새로운** 문자열이다.
따라서 newStr 변수는 다음 그림과 같이 새로 생성된 "JAVA 프로그래밍" 문자열을 참조한다.

<img src="https://github.com/silxbro/java/assets/142463332/fe4625df-c7ad-4d3a-b7fb-df9ba0ee9132" width="350" height="220"/>

- [ReplaceExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec05/ReplaceExample.java)
<br/>

## 문자열 잘라내기
문자열에서 **특정 위치의 문자열을 잘라내어 가져오고** 싶다면 **`substring()`** 메소드를 사용한다.
|메소드|설명|
|:---|:---|
|**substring(int beginIndex)**|beginIndex에서 끝까지 잘라내기|
|**substring(int beginIndex, int endIndex)**|beginIndex에서 endIndex `앞`까지 잘라내기|

다음 코드를 보자.
```java
String ssn = "880815-1234567";
String firstNum = ssn.substring(0, 6);
String secondNum = ssn.substring(7);
```
- 주어진 ssn의 문자열을 인덱싱하면 다음과 같다.<br/>
  <img src="https://github.com/silxbro/java/assets/142463332/dfba8cd6-20c1-44aa-9f2a-64a1f96aac67" width="400" height="50"/><br/>
  따라서 firstNum 변수는 "880815" 문자열을 참조하고, secondNum 변수는 "1234567"을 참조한다.
<br/>

- [SubStringExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec05/SubStringExample.java)
<br/>

## 문자열 찾기
문자열에서 **특정 문자열의 위치**를 찾고자 할 때에는 **`indexOf()`** 메소드를 사용한다. indexOf() 메소드는 주어진 문자열이 **시작**되는 인덱스를 리턴한다. 다음 코드를 보자.
```java
String subject = "자바 프로그래밍";
int index = subject.indexOf("프로그래밍");
```
- index 변수에는 3이 저장되는데, 다음과 같이 "자바 프로그래밍"에서 "프로그래밍" 문자열의 인덱스 위치가 3번이기 때문이다.
  <img src="https://github.com/silxbro/java/assets/142463332/ec41c498-ecb1-4699-94e8-6233a4d1a449" width="220" height="50"/><br/>

만약 주어진 문자열이 **포함되어 있지 않으면** indexOf() 메소드는 `-1`을 리턴한다. 주어진 문자열이 포함되어 있는지 여부에 따라 실행 코드를 달리하고 싶다면 if 조건식을 사용해서
다음과 같이 코드를 작성할 수 있다.
```java
int index = subject.indexOf("프로그래밍");
if (index == -1) {
  // 포함되어 있지 않은 경우
} else {
  // 포함되어 있는 경우
}
```
주어진 문자열이 **단순히 포함되어 있는지만 조사**하고 싶다면 **`contains()`** 메소드를 사용하면 편리하다. 원하는 문자열이 포함되어 있으면 contains() 메소드는 `true`를 리턴하고,
그렇지 않으면 `false`를 리턴한다.
```java
boolean result = subject.contains("프로그래밍");
```
- [IndexOfContainsExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec05/IndexOfContainsExample.java)
<br/>

## 문자열 분리
문자열이 **구분자**를 사용하여 여러 개의 문자열로 구성되어 있을 경우, 이를 **따로 분리**해서 얻고 싶다면 **`split()`** 메소드를 사용한다. 다음 코드를 보자.
```java
String board = "번호,제목,내용,글쓴이";
String[] arr = board.split(",");
```
- board는 쉼표로 구분된 문자열을 가지고 있다. split() 메소드를 호출할 때 쉼표를 제공하면 분리된 문자열로 구성된 배열(array)을 얻을 수 있다.<br/>
  <img src="https://github.com/silxbro/java/assets/142463332/4136b79e-b37c-472c-9622-7bb00d64e16a" width="220" height="50"/><br/>
<br/>

- [SplitExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec05/SplitExample.java)
