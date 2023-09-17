# main() 메소드의 String[] 매개변수 용도
<br/>

자바 프로그램을 실행하기 위해 지금까지 main() 메소드를 작성했는데, 여기에서 문자열 배열 형태인 `String[] args` 매개변수가 왜 필요한지 알아보자.<br/>
윈도우의 명령 프롬프트나 맥OS의 터미널에서 프로그램을 실행할 때는 **요구하는 값**이 있을 수 있다.
예를 들어 두 수를 입력받고 덧셈을 수행하는 Sum 프로그램은 실행할 때 다음과 같이 두 수를 요구할 수 있다.
```java
java Sum 10 20
```
공백으로 구분된 10과 20은 문자열로 취급되며 **String[] 배열의 항목 값**으로 구성된다. 그리고 main() 메소드 호출 시 **매개값**으로 전달된다.

<img src="https://github.com/silxbro/java/assets/142463332/693e1d52-321c-4ad3-956b-bdc52eaeda14" width="400" height="130"/><br/>

main() 메소드 중괄호 {} 내에서 문자열 "10"과 "20"은 다음과 같이 얻을 수 있다.
```java
String x = args[0];
String y = args[1];
```
문자열 "10"과 "20"을 int 타입으로 변환하려면 다음과 같이 강제 타입 변환을 해야 한다.
```java
int x = Integer.parseInt(args[0]);
int y = Integer.parseInt(args[1]);
```
Sum을 실행할 때 몇 개의 값이 입력되었는지 확인하려면 main() 메소드에서 배열의 length 필드를 읽으면 된다. 두 개의 값이 입력되지 않았다면 다음과 같이 출력 메시지를 보여줄 수도 있다.
```java
if (args.length != 2) {
  System.out.println("실행 시 두 개의 값이 필요합니다.");
}
```
만약 다음과 같이 값을 주지 않고 실행하면 args.length는 0이 된다.
```java
java Sum
```
다음 예제는 Sum 실행 입력값이 2개가 아닐 경우 입력값이 부족함을 알리고 강제 종료한다. 그리고 2개의 값이 입력되었을 때만 덧셈의 결과를 출력한다.
- [MainStringArrayArgument.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch05/sec11/MainStringArrayArgument.java)

바로 실행하면 '프로그램 입력값이 부족'이라고 출력된다. 실행 시 입력값을 주지 않기 때문에 args는 길이 0인 String 배열을 참조한다. 따라서 5라인의 if 조건식이 true가 되어
if 블록이 실행된다.

intelliJ에서 입력값을 주고 실행하려면 다음 순서대로 진행하면 된다.

1. intelliJ 상단 메뉴에서 [Run] - [Edit Configurations]를 선택하면 나오는 대화상자에서 [working directory] 및 [Build and run] 입력란이 알맞게 입력되어 있는지 확인한다.<br/>

   <img src="https://github.com/silxbro/java/assets/142463332/3a1a0d93-cd1b-4eff-9200-d078cc56a060" width="450" height="300"/>
   <img src="https://github.com/silxbro/java/assets/142463332/97c8d6f9-daab-4361-b57d-4459474344df" width="800" height="500"/><br/>
<br/>
   
2. [Build and run] - Program arguments 입력란에 10과 20을 입력한다. 그리고 [Run] 버튼을 클릭한다.<br/>

   <img src="https://github.com/silxbro/java/assets/142463332/f9aa0368-82cb-461b-9c8a-d89a81127665" width="800" height="500"/>
   <img src="https://github.com/silxbro/java/assets/142463332/442520ad-cbc2-49e5-be96-b71a2ddfc0d7" width="400" height="120"/>
<br/>   

#### [명령 프롬프트나 터미널에서 입력값 주기]
- 윈도우의 명령 프롬프트나 맥OS의 터미널에서 입력값을 주고 실행하고 싶다면 `cd` 명령을 사용해서 `bin` 폴더까지 이동 후 다음과 같이 java 명령어를 실행하면 된다.
  ```java
  java ch05.sec11.MainStringArrayArgument 10 20
  ```
