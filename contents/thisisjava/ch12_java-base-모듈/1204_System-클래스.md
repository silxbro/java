# System 클래스
<br/>

자바 프로그램은 운영체제상에서 바로 실행되는 것이 아니라 자바 가상 머신(JVM) 위에서 실행된다. 따라서 운영체제의 모든 기능을 자바 코드로 직접 접근하기란 어렵다.
하지만 java.lang 패키지에 속하는 **`System` 클래스**를 이용하면 **운영체제의 일부 기능을 이용**할 수 있다.

System 클래스의 **정적(static)** 필드와 메소드를 이용하면 프로그램 종료, 키보드 입력, 콘솔(모니터) 출력, 현재 시간 읽기, 시스템 프로퍼티 읽기 등이 가능하다.

|정적 멤버|용도|
|:---|:---|
|**[필드]<br/>out<br/>err<br/>in**|<br/>콘솔(모니터)에 문자 출력<br/>콘솔(모니터)에 에러 내용 출력<br/>키보드 입력|
|**[메소드]<br/>exit(int status)<br/>currentTimeMillis()<br/>nanoTime()<br/>getProperty()<br/>getenv()**|<br/>프로세스 종료<br/>현재 시간을 밀리초 단위의 long 값으로 리턴<br/>현재 시간을 나노초 단위의 long 값으로 리턴<br/>운영체제와 사용자 정보 제공<br/>운영체제의 환경 변수 정보 제공|

<br/>

## 콘솔 출력
**`out`** 필드를 이용하면 **콘솔에 원하는 문자열을 출력**할 수 있다. **`err`** 필드도 out 필드와 동일한데, 차이점은 콘솔 종류에 따라 **에러 내용이 빨간색으로 출력**된다는 것이다.
<br/>

다음은 err 필드의 println() 메소드로 에러 내용을 출력하는 예제이다.
- [ErrExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec04/ErrExample.java)
<br/>

## 키보드 입력
자바는 **키보드로부터 입력된 키를 읽기** 위해 System 클래스에서 **`in`** 필드를 제공한다.
다음과 같이 in 필드를 이용해서 read() 메소드를 호출하면 입력된 키의 코드값을 얻을 수 있다.
```java
int keyCode = System.in.read();
```
키 코드는 각 키에 부여되어 있는 번호로, 다음과 같다.

|||||||
|:---|:---|:---|:---|:---|:---|
|0 = 48<br/>1 = 49<br/>2 = 50<br/>3 = 51<br/>4 = 52<br/>5 = 53<br/>6 = 54<br/>7 = 55<br/>8 = 56<br/>9 = 57<br/><br/><br/><br/>|A = 65<br/>B = 66<br/>C = 67<br/>D = 68<br/>E = 69<br/>F = 70<br/>G = 71<br/>H = 72<br/>I = 73<br/>J = 74<br/>K = 75<br/>L = 76<br/>M = 77|N = 78<br/>O = 79<br/>P = 80<br/>Q = 81<br/>R = 82<br/>S = 83<br/>T = 84<br/>U = 85<br/>V = 86<br/>W = 87<br/>X = 88<br/>Y = 89<br/>Z = 90|a = 97<br/>b = 98<br/>c = 99<br/>d = 100<br/>e = 101<br/>f = 102<br/>g = 103<br/>h = 104<br/>i = 105<br/>j = 106<br/>k = 107<br/>l = 108<br/>m = 109|n = 110<br/>o = 111<br/>p = 112<br/>q = 113<br/>r = 114<br/>s = 115<br/>t = 116<br/>u = 117<br/>v = 118<br/>w = 119<br/>x = 120<br/>y = 121<br/>z = 122|[Windows]<br/>Enter = 13,10<br/><br/>[macOS]<br/>Enter = 10<br/><br/><br/><br/><br/><br/><br/><br/><br/>|

read() 메소드는 호출과 동시에 키 코드를 읽는 것이 아니라, [Enter] 키를 누르기 전까지는 대기 상태이다가 **`Enter` 키를 누르면 입력했던 키들을 하나씩 읽기 시작**한다.
단, read() 메소드는 IOException을 발생할 수 있는 코드이므로 예외 처리가 필요하다.

<br/>

다음은 숫자 키 1과 2를 입력함에 따라 speed 필드 값을 증감하는 예제이다. 그리고 숫자 키인 3을 입력하면 while 문을 종료하도록 했다.
- [InExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec04/InExample.java)

<br/>

## 프로세스 종료
운영체제는 실행 중인 프로그램을 프로세스(process)로 관리한다. 자바 프로그램을 시작하면 JVM 프로세스가 생성되고, 이 프로세스가 main() 메소드를 호출한다.
**프로세스를 강제 종료**하고 싶다면 **`System.exit()`** 메소드를 사용한다.
```java
System.exit(int status)
```
exit() 메소드는 int 매개값이 필요한데, 이 값을 **종료 상태값**이라고 한다. 종료 상태값으로 어떤 값을 주더라도 프로세스는 종료되는데 **정상 종료**일 경우 `0`,
**비정상 종료**는 `1` 또는 `-1`로 주는 것이 관례이다.

#### [종료 상태값의 활용]
- 종료 상태값은 System에 설정되는 SecurityManager에서 활용되는데, 종료 상태값에 따라 특정 행위를 할 수 있도록 코딩할 수 있다.
  하지만 Java 17에서 SecurityManager가 `Deprecated(더 이상 사용되지 않음)`됨에 따라 여기에서 활용 코드에 대한 설명은 생략한다.

<br/>

다음 예제는 i가 5가 되면 프로세스를 정상 종료한다.
- [ExitExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec04/ExitExample.java)

<br/>

## 진행 시간 읽기
System 클래스의 currentTimeMillis() 메소드와 nanoTime() 메소드는 **`1970년 1월 1일 0시`부터 시작해서 현재까지 진행된 시간을 리턴**한다.

|메소드|용도|
|:---|:---|
|**`long` currentTimeMillis()**|1/1000초 단위로 진행된 시간을 리턴|
|**`long` nanoTime()**|1/(10^9)초 단위로 진행된 시간을 리턴|

이 두 메소드는 **프로그램 처리 시간을 측정하는 데 주로 사용**된다. 프로그램 처리를 시작할 때 한 번, 끝날 때 한 번 읽어서 그 차이를 구하면 프로그램 처리 시간이 나온다.

<br/>

다음 예제는 for 문을 사용해서 1부터 1000000까지의 합을 구하는데 걸린 시간을 출력한다.
- [MeasureRunTimeExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec04/MeasureRunTimeExample.java)

<br/>

## 시스템 프로퍼티 읽기
**`시스템 프로퍼티(System Property)`** 란 자바 프로그램이 시작될 때 **자동 설정되는 시스템의 속성**을 말한다.
예를 들어 운영체제 종류 및 사용자 정보, 자바 버전 등의 기본 사양 정보가 해당된다.

다음은 시스템 프로퍼티의 주요 속성 이름(key)과 값(value)에 대해 설명한 것이다.

|속성 이름(key)|설명|값(value)|
|:---|:---|:---|
|java.specification.version|자바 스펙 버전|17|
|java.home|JDK 디렉토리 경로|C:\Program Files\Java\jdk-18.0.2.1|
|os.name|운영체제|Windows 10|
|user.name|사용자 이름|xxx|
|user.home|사용자 홈 디렉토리 경로|C:\Users\xxx|
|user.dir|현재 디렉토리 경로|C:\Users\EHPARK\work\java_projects\java|

<br/>

다음은 운영체제 이름, 사용자 이름, <사용자 홈> 디렉토리를 따로 출력하고, 모든 시스템 프로퍼티의 속성 이름과 값을 출력하는 예제이다.
출력 결과를 보고 어떤 속성 이름과 값이 있는지만 확인하자.
- [GetPropertyExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch12/sec04/GetPropertyExample.java)
