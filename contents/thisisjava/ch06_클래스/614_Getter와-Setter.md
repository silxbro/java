# Getter와 Setter
<br/>

객체의 필드(데이터)를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성(결점이 없는 성질)이 깨질 수 있다.

예를 들어 자동차의 속력은 음수가 될 수 없는데, 외부에서 음수로 변경하면 객체의 무결성이 깨진다.
- ```java
  Car myCar = new Car();
  myCar.speed = -100;
  ```
<br/>

이러한 문제점 때문에 **객체 지향 프로그래밍**에서는 직접적인 외부에서의 필드 접근을 막고 대신 **`메소드`를 통해 필드에 접근하는 것을 선호**한다.
그 이유는 메소드는 **데이터를 검증해서 유효한 값만 필드에 저장**할 수 있기 때문이다. 이러한 역할을 하는 메소드가 **`Setter`** 이다.

- 다음 코드를 보자. speed 필드는 private 접근 제한을 가지므로 외부에서 접근하지 못한다. speed 필드를 변경하기 위해서는 Setter인 setSpeed() 메소드를 이용해야 한다.
  setSpeed() 메소드는 **외부에서 제공된 변경값(매개값)을 if 문으로 검증**하는데, 음수일 경우 0을 필드값으로 저장한다.
  
  ```java
  private double speed;

  public void setSpeed(double speed) {
    if (speed < 0) {    // 매개값이 음수일 경우 speed 필드에 0으로 저장하고, 메소드 실행 종료
      this.speed = 0;
      return;
    } else {
      this.speed = speed;
    }
  }
  ```
<br/>

외부에서 객체의 필드를 읽을 때에도 메소드가 필요한 경우가 있다. **필드값이 객체 외부에서 사용하기에 부적절한 경우, 메소드로 적절한 값으로 변환해서 리턴**할 수 있기 때문이다.
이러한 역할을 하는 메소드가 **`Getter`** 이다.

- 다음 예시를 보자. speed 필드는 private 접근 제한을 가지므로 외부에서 읽지 못한다. speed 필드를 읽기 위해서는 Getter인 getSpeed() 메소드를 이용해야 한다. getSpeed() 메소드는
  마일 단위의 필드 값을 km 단위로 변환해서 외부로 리턴한다.
  
  ```java
  private double speed;   // speed의 단위는 마일

  public double getSpeed() {
    double km = speed * 1.6;  // 필드값인 마일을 km 단위로 환산 후 외부로 리턴
    return km;
  }
  ```
<br/>

다음은 Getter와 Setter의 기본 작성 방법을 보여준다. 필요에 따라 `Getter`에서 **변환 코드**를 작성하거나 `Setter`에서 **검증 코드**를 작성할 수 있다.

```java
private 타입 fieldName;       // 필드 접근 제한자: private

// Getter
public 타입 getFieldName() {
  return fieldName;
}
/*
  접근제한자 : public
  리턴 타입 : 필드타입
  메소드 이름 : get + 필드이름 (첫 글자 대문자)
  리턴값 : 필드값
*/

// Setter
public void setFieldName(타입 fieldName) {
  this.fieldName = fieldName;
}
/*
  접근제한자 : public
  리턴 타입 : void
  메소드 이름 : set + 필드이름 (첫 글자 대문자)
  매개변수 타입 : 필드타입
*/
```
필드 타입이 `boolean`일 경우에는 Getter는 get으로 시작하지 않고 **is**로 시작하는 것이 관례이다.
- stop 필드의 Getter는 다음과 같이 작성할 수 있다.
  
  ```java
  private boolean stop;       // 필드 접근 제한자: private

  // Getter
  public boolean isStop() {
    return stop;
  }
  /*
  접근제한자 : public
  리턴 타입 : 필드타입(boolean)
  메소드 이름 : is + 필드이름 (첫 글자 대문자)
  리턴값 : 필드값
  */
  ```
<br/>

- [Car.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch06/sec14/Car.java)
- [CarExample](https://github.com/silxbro/java/blob/main/src/thisisjava/ch06/sec14/CarExample.java)
