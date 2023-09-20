# private 메소드
<br/>

인터페이스의 상수 필드, 추상 메소드, 디폴트 메소드, 정적 메소드는 모두 public 접근 제한을 갖는다. 이 멤버들을 선언할 때에는 public을 생략하더라도
컴파일 과정에서 public 접근 제한자가 붙어 항상 외부에서 접근이 가능하다. 또한 인터페이스에 외부에서 접근할 수 없는 **`private` 메소드 선언도 가능**하다.

|구분|설명|
|:---|:---|
|private 메소드|구현 객체가 필요한 메소드|
|private 정적 메소드|구현 객체가 필요 없는 메소드|

private 메소드는 디폴트 메소드 안에서만 호출이 가능한 반면, private 정적 메소드는 디폴트 메소드뿐만 아니라 정적 메소드 안에서도 호출이 가능하다.
private 메소드의 용도는 **디폴트와 정적 메소드들의 중복 코드를 줄이기 위함**이다.

<br/>

다음 예제는 Service 인터페이스에서 2개의 디폴트 메소드와 2개의 정적 메소드 중 중복 코드 부분을 각각 private 메소드와 private 정적 메소드로 선언하고 호출하는 방법을 보여준다.
- [Service.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch08/sec07/Service.java)
- [ServiceImpl.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch08/sec07/ServiceImpl.java)
- [ServiceExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch08/sec07/ServiceExample.java)
