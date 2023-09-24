# Object 클래스
<br/>

클래스를 선언할 때 extends 키워드로 다른 클래스를 상속하지 않으면 암시적으로 java.lang.Object 클래스를 상속하게 된다.
따라서 **자바의 모든 클래스는 `Object`의 자식이거나 자손 클래스이다**.

그렇기 때문에 **Object가 가진 메소드는 모든 객체에서 사용할 수 있다**. 다음은 Object가 가진 주요 메소드를 설명한 표이다.

|메소드|용도|
|:---|:---|
|`boolean` **equals(Object obj)**|객체의 **번지**를 비교하고 결과를 리턴|
|`int` **hashCode()**|객체의 **해시코드**를 리턴|
|`String` **toString()**|객체 **문자 정보**를 리턴|
<br/>

## 객체 동등 비교
Object의 **`equals()`** 메소드는 **객체의 번지를 비교하고 boolean 값을 리턴**한다.
```java
public boolean equals(Object obj)
```
equals() 메소드의 매개변수 타입이 Object이므로 자동 타입 변환에 의해 모든 객체가 매개값으로 대입될 수 있다. equals() 메소드는 비교 연산자인 `==`과 동일한 결과를 리턴한다.
두 객체가 동일한 객체라면 true를 리턴하고, 그렇지 않으면 false를 리턴한다.
```java
Object obj1 = new Object();
Object obj2 = obj1;

// ①과 ②의 결과가 동일
boolean result = obj1.equals(obj2);  // ①
boolean result = (ob1 == obj2);      // ②
```
일반적으로 Object의 equals() 메소드는 **재정의**해서 동등 비교용으로 사용된다. 동등 비교란 객체가 비록 달라도 **내부의 데이터가 같은지를 비교**하는 것을 말한다.
- 예를 들어 String은 equals() 메소드를 재정의해서 내부 문자열이 같은지를 비교한다.
<br/>
<br/>

다음 예제는 Member 객체의 동등 비교를 위해서 equals() 메소드를 재정의한다. Member 타입이면서 id 필드값이 같을 경우는 true를 리턴하고, 그 이외의 경우는 모두 false를 리턴한다.
- [Member.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam01/Member.java)
- [EqualsExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam01/EqualsExample.java)

<br/>

## 객체 해시코드
객체 해시코드란 객체를 식별하는 정수를 말한다. Object의 **`hashCode()`** 메소드는 **객체의 메모리 번지를 이용해서 해시코드를 생성하기 때문에 객체마다 다른 정수값을 리턴**한다.
hashCode() 메소드의 용도는 equals() 메소드와 비슷한데, **두 객체가 동등한지를 비교할 때 주로 사용**한다.
```java
public int hashCode()
```
equals() 메소드와 마찬가지로 hashCode() 메소드 역시 객체의 데이터를 기준으로 **재정의**해서 새로운 정수값을 리턴하도록 하는 것이 일반적이다.
객체가 다르다 할지라도 **내부 데이터가 동일하다면 같은 정수값을 리턴**하기 위해서이다.

<br/>

자바는 **두 객체가 동등함을 비교**할 때 hashCode()와 equals() 메소드를 같이 사용하는 경우가 많다. **우선 `hashCode()`** 가 리턴하는 정수값이 같은지를 확인하고,
**그 다음 `equals()`** 메소드가 true를 리턴하는지를 확인해서 동등 객체임으로 판단한다.

<img src="https://github.com/silxbro/java/assets/142463332/439c2e1b-c3d7-4454-ad60-0d59bc8b60ee" width="550" height="150"/><br/>

<br/>

다음 예제는 Student 객체를 동등 비교하기 위해 hashCode()와 equals() 메소드를 재정의했다. 학생 번호와 이름으로 해시코드를 생성하고, 학생 번호와 이름이 동일할 경우에만 equals()가
true를 리턴하도록 했다.
- [Student.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam02/Student.java)
- [HashCodeExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam02/HashCodeExample.java)

<br/>

컬렉션에 속하는 **HashSet**은 동등 객체를 중복 저장하지 않는 특징이 있다. HashSet은 hashCode()와 equals() 메소드를 이용해서 동등 객체인지 확인한다.

다음 예제에서 Student 객체를 HashSet에 저장하고, 저장된 개수를 확인해보자.
- [HashSetExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam02/HashSetExample.java)

<br/>

## 객체 문자 정보
Object의 **`toString()`** 메소드는 **객체의 문자 정보를 리턴**한다. 객체의 문자 정보란 객체를 문자열로 표현한 값을 말한다.
기본적으로 Object의 toString() 메소드는 `클래스명@16진수해시코드`로 구성된 문자열을 리턴한다.
```java
Object obj = new Object();
System.out.println(obj.toString());
```
```java
java.lang.Object@de6ced
```
객체의 문자 정보가 중요한 경우에는 Object의 toString() 메소드를 **재정의**해서 **간결하고 유익한 정보를 리턴**하도록 해야 한다.
- 예를 들어 Date 클래스는 현재 날짜와 시간을, String 클래스는 저장된 문자열을 리턴하도록 toString() 메소드를 재정의하고 있다.

<br/>

다음 예제는 SmartPhone 객체의 문자 정보로 제조회사 및 운영체제를 리턴하도록 toString() 메소드를 재정의한다.
- [SmartPhone.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam03/SmartPhone.java)
- [ToStringExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam03/ToStringExample.java)

System.out.println() 메소드는 매개값이 **기본 타입**(byte, short, int, long, float, double, boolean)이거나 **문자열**일 경우 **`해당 값`을 그대로 출력**한다.
만약 매개값이 **객체**가 되면 객체의 **`toString()` 메소드를 호출**해서 리턴값을 출력한다.

<br/>

## 레코드 선언
데이터 전달을 위한 **DTO(Data Transfer Object)를 작성**할 때 반복적으로 사용되는 코드를 줄이기 위해 Java 14부터 **`레코드(record)`가 도입**되었다.
- 예를 들어 사람의 정보를 전달하기 위한 Person DTO가 다음과 같다고 가정해보자.
  
  ```java
  public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String name() { return this.name; }
    public int age() { return this.age; }

    @Override
    public int hashCode() { ... }

    @Override
    public boolean equals(Object obj) { ... }

    @Override
    public String toString() { ... }
  }
  ```
  Person의 데이터(필드)는 읽기만 가능하도록 필드를 private final로 선언하였으며, 필드 이름과 동일한 Getter 메소드(name(), age())를 가지고 있다.
  그리고 동등 비교를 위해 hashCode(), equals() 메소드를 재정의하고 있고, 의미 있는 문자열 출력을 위해 toString() 메소드를 재정의하고 있다.

다음 코드는 위와 동일한 코드를 생성하는 레코드 선언이다. class 키워드 대신에 **`record`** 로 대체하고 **클래스 이름 뒤에 괄호를 작성해서 저장할 데이터의 종류를 변수로 선언**하였다.
```java
public record Person(String name, int age) {
}
```
이렇게 선언된 레코드 소스를 컴파일하면 변수의 타입과 이름을 이용해서 **`private final` 필드**가 자동 생성되고, **생성자** 및 **`Getter` 메소드**가 자동으로 추가된다.
그리고 **`hashCode()`, `equals()`, `toString()` 메소드를 재정의한 코드**도 자동으로 추가된다.
  
<br/>

다음은 레코드로 선언된 Member를 이용하는 방법을 보여준다.
- [Member.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam04/Member.java)
- [RecordExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam04/RecordExample.java)
 
<br/>

## 롬복 사용하기
**`롬복(Lombok)`** 은 JDK에 포함된 표준 라이브러리는 아니지만 **개발자들이 즐겨 쓰는 자동 코드 생성 라이브러리**이다.
롬복은 레코드와 마찬가지로 DTO 클래스를 작성할 때 `Getter`, `Setter`, `hashCode()`, `equals()`, `toString()` 메소드를 자동 생성하기 때문에 작성할 코드의 양을 줄여준다.

레코드와의 차이점은 **필드가 final이 아니며**, 값을 읽는 Getter는 `getXxx(또는 isXxx)`로, 값을 변경하는 Setter는 `setXxx`로 생성된다는 것이다.
- getXxx와 setXxx는 자바빈즈(JavaBeans)의 정식 Getter와 Setter이다.

### [롬복 설치하기]
**이클립스**에서 롬복을 사용하려면 설치 과정이 필요하다. 다음 URL로 가서 설치 파일(lombok.jar)을 다운로드한다.

https://projectlombok.org/download
  
<img src="https://github.com/silxbro/java/assets/142463332/bdb02bed-6dfd-40f9-8656-2037d5d3b4a4" width="200" height="30"/><br/>

명령 프롬프트(윈도우) 또는 터미널(맥OS)에서 다운로드 받은 lombok.jar 파일이 있는 곳으로 이동해서 다음 명령어를 실행한다.
주의할 점은 명령 프롬프트는 관리자 권한으로 실행해야 한다는 것이다.
```java
java -jar lombok.jar
```
다음 화면은 윈도우와 맥OS에서 자동으로 롬복을 설치할 이클립스를 찾은 모습이다. 만약 찾지 못했다면 [Specity location] 버튼을 클릭해서 수동으로 이클립스를 지정하면 된다.
[Install/Update] 버튼을 클릭해서 설치한다.

<img src="https://github.com/silxbro/java/assets/142463332/01d63f19-578e-47bd-b86c-0e9ac06455cd" width="750" height="250"/><br/>

설치가 끝나면 [Quit Installer] 버튼을 클릭해서 닫는다. 그리고 이클립스가 롬복 기능을 인식하도록 이클립스를 재시작한다.

<img src="https://github.com/silxbro/java/assets/142463332/b0ead674-4dfb-4049-895f-019b533552cd" width="370" height="220"/><br/>

이클립스가 재시작되었다면, Package Explorer 뷰에서 thisisjava 프로젝트를 선택한 다음 마우스 오른쪽 버튼으로 클릭해 [New] - [Folder] 메뉴를 선택해서 lib 폴더를 생성한다.

<img src="https://github.com/silxbro/java/assets/142463332/edbb6012-d3c8-4baf-850d-0038dc73778b" width="250" height="100"/><br/>

그리고 다운로드한 lombok.jar 파일을 lib 폴더로 복사한다.

마지막으로 thisisjava 프로젝트에서 lombok 라이브러리를 사용할 수 있도록 lombok.jar 파일을 선택한 다음 마우스 오른쪽 버튼으로 클릭해 [Build Path] - [Add to Build Path]를
선택해준다.

<img src="https://github.com/silxbro/java/assets/142463332/66e0b4f9-93c2-4d85-90aa-f4dc64ef2ac8" width="500" height="250"/><br/>
<br/>

**intelliJ**에서 롬복을 사용하려면 다음과 같이 설치하면 된다.

좌측 상단 메뉴에서 [File] - [Project Structure]을 클릭한다.

<img src="https://github.com/silxbro/java/assets/142463332/ebb4a03d-dd3e-4f81-8601-2ac720b44c15" width="600" height="300"/><br/>

Project Structure 대화창의 [Project Settings] - [Modules]를 클릭한 후, 상단 메뉴에서 [Dependencies]를 선택한다. [+] 버튼을 누른 후 [1 JARs or Directories...]를 클릭한다.

<img src="https://github.com/silxbro/java/assets/142463332/bf253098-42d0-4f4e-a4dc-80393c96a4b8" width="600" height="300"/><br/>

[Attach Files or Directories] 대화창에서 lombok.jar 저장 경로를 선택한 후, [OK] 버튼을 누른다.

<img src="https://github.com/silxbro/java/assets/142463332/f0c05585-46c4-4a8e-9c30-5df4568f9419" width="600" height="450"/><br/>

[Depedencies storage format] 체크박스가 IntelliJ IDEA(.iml)로 설정되어 있는지 확인한 후, [OK] 버튼을 누른다.

<img src="https://github.com/silxbro/java/assets/142463332/51dd18eb-f5e6-4596-b272-6d847cb083f1" width="600" height="450"/><br/>

좌측 상단 메뉴에서 [File] - [Settings]를 클릭한다.

<img src="https://github.com/silxbro/java/assets/142463332/deee5e63-3825-41fc-b8f5-701e56170d9f" width="600" height="300"/><br/>

Settings 대화창의 좌측 메뉴에서 [Plugins] - [Marketplace]를 클릭한 후, 검색창에 'lombok'을 검색, [install] 을 클릭하여 설치한다.

<img src="https://github.com/silxbro/java/assets/142463332/ae78bcea-f61c-430c-84a5-49160135c22c" width="600" height="400"/><br/>

좌측 상단 메뉴에서 [File] - [Settings]을 클릭하여 [Settings] 대화창을 연 후, [Build, Execution, Deployment] - [Compiler] - [Annotation Processors]를 클릭한다.
[Enable Annotation Processing]을 체크한 후, [OK] 버튼을 누른다.

<img src="https://github.com/silxbro/java/assets/142463332/a1099c42-e491-46ca-96e8-552f18c20cdb" width="600" height="400"/><br/>

---

이제 롬복 라이브러리를 사용해보자. 먼저 다음과 같이 Member 클래스를 선언한다. 3개의 필드를 선언하고 class 선언 위에 @Data를 붙인다. 이 @Data를 **`어노테이션`** 이라고 한다.
- [Member.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam05/Member.java)
  
@Data가 붙게 되면 컴파일 과정에서 `기본 생성자`와 함께 `Getter`, `Setter`, `hashCode()`, `equals()`, `toString()` 메소드가 자동 생성된다.
상단 메뉴에서 [View] - [Tool Windows] - [Structure]를 클릭하면, Structure 뷰에서 Member 클래스를 확장해보면 알 수 있다.

<img src="https://github.com/silxbro/java/assets/142463332/04a8e898-4400-4043-8c9d-4e3c5f2729c4" width="300" height="600"/><br/>

@Data 외에도 다음과 같은 어노테이션을 사용할 수 있다.

|어노테이션|설명|
|:---|:---|
|**@NoArgsConstructor**|기본(매개변수가 없는) 생성자 포함|
|**@AllArgsConstructor**|모든 필드를 초기화시키는 생성자 포함|
|**@RequiredArgsConstructor**|기본적으로 매개변수가 없는 생성자 포함.<br/>만약 `final` 또는 `@NonNull`이 붙은 필드가 있다면 이 필드만 초기화시키는 생성자 포함|
|**@Getter**|Getter 메소드 포함|
|**@Setter**|Setter 메소드 포함|
|**@EqualsAndHashCode**|equals()와 hashCode() 메소드 포함|
|**@ToString**|toString() 메소드 포함|

- **`@Data`** 는 `@RequiredArgsConstructor`, `@Getter`, `@Setter`, `@EqualsAndHashCode`, `@ToString` 어노테이션들이 **합쳐진 것과 동일**한 효과를 낸다.

<br/>

다음은 매개변수가 없는 기본 생성자뿐만 아니라 모든 필드를 초기화하는 생성자까지 포함시키는 예제이다.
- [Member.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam05/Member.java)
  
  <img src="https://github.com/silxbro/java/assets/142463332/45600e91-1d92-4728-a597-c07c1242ac10" width="300" height="350"/><br/>

@Data에 포함되어 있는 @RequiredArgsConstructor는 기본적으로 매개변수가 없는 생성자를 포함시키지만, final 또는 @NonNull이 붙은 필드가 있다면 이 필드만 초기화시키는
생성자를 포함시킨다.
- [Member.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec03/exam05/Member.java)

  <img src="https://github.com/silxbro/java/assets/142463332/007fc6d5-a62b-40fc-8457-b67badec3479" width="300" height="300"/><br/>

final과 @NonNull의 차이점은 초기화된 **`final`** 필드는 **변경할 수 없지만(Setter가 만들어지지 않음)**,
**`@NonNull`** 은 **null이 아닌 다른 값으로 Setter를 통해 변경할 수 있다는 것**이다.
