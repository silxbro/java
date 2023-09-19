# final 클래스와 final 메소드
<br/>

필드 선언 시에 final을 붙이면 초기값 설정 후 값을 변경할 수 없다. 그렇다면 클래스와 메소드에 final을 붙이면 어떤 효과가 일어날까? `final 클래스`와 `final 메소드`는 **상속**과 관련이 있다.
<br/>
<br/>

## final 클래스
클래스를 선언할 때 final 키워드를 class 앞에 붙이면 최종적인 클래스이므로 **더 이상 상속할 수 없는 클래스**가 된다.
즉 final 클래스는 **부모 클래스가 될 수 없어** 자식 클래스를 만들 수 없다.
```java
public final class 클래스 {...}
```
- 대표적인 예가 **String** 클래스이다. String 클래스는 다음과 같이 선언되어 있다.
  ```java
  public final class String {...}
  ```
  그래서 다음과 같이 자식 클래스를 만들 수 없다.
  ```java
  public class NewString /* extends String */ {...}
  ```
<br/>

다음 예제는 Member 클래스를 선언할 때 final을 지정함으로써 Member를 상속해 VeryImportantPerson을 선언할 수 없음을 보여준다.
- [Member.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch07/sec05/exam01/Member.java)
- [VeryImportantPerson.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch07/sec05/exam01/VeryImportantPerson.java)
<br/>

## final 메소드
메소드를 선언할 때 final 키워드를 붙이면 이 메소드는 최종적인 메소드이므로 **오버라이딩할 수 없는 메소드**가 된다.
즉 부모 클래스를 상속해서 자식 클래스를 선언할 때, 부모 클래스에 선언된 final 메소드는 자식 클래스에서 재정의할 수 없다.
```java
public final 리턴타입 메소드(매개변수, ...) {...}
```
<br/>

다음 예제는 Car 클래스의 stop() 메소드를 final로 선언했기 때문에 자식 클래스인 SportCar에서 stop() 메소드를 오버라이딩할 수 없음을 보여준다.
- [Car.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch07/sec05/exam02/Car.java)
- [SportsCar.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch07/sec05/exam02/SportsCar.java)
