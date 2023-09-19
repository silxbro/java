# final 필드와 상수
<br/>

인스턴스 필드와 정적 필드는 언제든지 값을 변경할 수 있다. 그러나 경우에 따라서는 **값을 변경하는 것을 막고 읽기만 허용**해야 할 때가 있다.
이때 **`final`** 필드와 상수를 선언해서 사용한다.
<br/>
<br/>

## final 필드 선언
final은 '최종적'이란 뜻을 가지고 있다. final 필드는 초기값이 저장되면 이것이 최종적인 값이 되어서 프로그램 실행 도중에 수정할 수 없게 된다.

final 필드는 다음과 같이 선언한다. 
```java
final 타입 필드 [= 초기값];
```

final 필드에 초기값을 줄 수 있는 방법은 다음 두 가지 밖에 없다.
```java
1. 필드 선언 시에 초기값 대입
2. 생성자에서 초기값 대입
```

고정된 값이라면 `필드 선언 시`에 주는 것이 제일 간단하다. 하지만 **복잡한 초기화 코드**가 필요하거나 객체 생성 시에 **외부에서 전달된 값으로 초기화**한다면 `생성자`에서 해야 한다.
이 두 방법을 사용하지 않고 final 필드를 그대로 남겨두면 **컴파일 에러**가 발생한다.

다음 예제에서 Korean 클래스를 보면 국가(nation)와 주민등록번호(ssn) 필드를 final 필드로 선언했다.
nation은 고정값이므로 선언 시에 초기값을 대입했고, ssn은 Korean 객체가 생성될 때 부여되므로 생성자 매개값으로 주민등록번호를 받아 초기값으로 대입했다.
- [Korean.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch06/sec11/exam01/Korean.java)
- [KoreanExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch06/sec11/exam01/KoreanExample.java)
<br/>

## 상수 선언
우리 주변에는 불변의 값이 있다. 불변의 값은 수학에서 사용되는 원주율 파이(π)나 지구의 무게 및 둘레 등이 해당된다.
이런 **불변의 값을 저장하는 필드**를 자바에서는 **`상수(constant)`** 라고 부른다.

상수는 객체마다 저장할 필요가 없고, 여러 개의 값을 가져도 안되기 때문에 **`static`이면서 `final`인 특성**을 가져야 한다. 따라서 상수는 다음과 같이 선언한다.
```java
static final 타입 상수 [= 초기값];
```
초기값은 선언 시에 주는 것이 일반적이지만, 복잡한 초기화가 필요할 경우에는 **정적 블록에서 초기화할 수도 있다**.
```java
static final 타입 상수;
static {
  상수 = 초기값;
}
```
상수 이름은 **모두 대문자**로 작성하는 것이 관례이다. 만약 서로 다른 단어가 혼합된 이름이라면 **`언더바(_)`로 단어들을 연결**한다.
- ```java
  static final double PI = 3.14159;
  static final double EARTH_SURFACE_AREA = 5.141785403641517E8;
  ```
또한 상수는 정적 필드이므로 클래스로 접근해서 읽을 수 있다.
```java
클래스명.상수
```
<br/>

- [Earth.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch06/sec11/exam02/Earth.java)
- [EarthExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch06/sec11/exam02/EarthExample.java)



  
