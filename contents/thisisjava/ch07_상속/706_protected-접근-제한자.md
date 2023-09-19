# protected 접근 제한자
<br/>

**`protected`** 는 **상속**과 관련이 있고, **public과 defalut의 중간**쯤에 해당하는 접근 제한을 한다.

protected는 같은 패키지에서는 default처럼 접근이 가능하나, **`다른`** 패키지에서는 **자식 클래스만 접근을 허용**한다.
protected는 필드와 생성자 그리고 메소드 선언에 사용될 수 있다.

<img src="https://github.com/silxbro/java/assets/142463332/f26483e7-dcc3-4b7b-b5bb-94143884498c" width="500" height="200"/><br/>
<br/>
<br/>

다음 A 클래스를 보면 protected로 선언된 필드, 생성자, 메소드가 있다.
- [A.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch07/sec06/package1/A.java)

다음 B 클래스는 A 클래스와 동일한 패키지에 있기 때문에 A의 protected 필드, 생성자, 메소드에 접근이 가능하다.
- [B.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch07/sec06/package1/B.java)

다음 C 클래스는 A 클래스와 다른 패키지에 있기 때문에 A의 protected 필드, 생성자, 메소드에 접근할 수 없다.
- [C.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch07/sec06/package2/C.java)

다음 D 클래스는 A 클래스와 다른 패키지에 있지만 A의 자식 클래스이므로 A의 protected 필드, 생성자, 메소드에 접근이 가능하다.
단 new 연산자를 사용해서 **생성자를 직접 호출할 수는 없고, 자식 생성자에서 super()로 A 생성자를 호출할 수 있다**.
- [D.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch07/sec06/package2/D.java)
