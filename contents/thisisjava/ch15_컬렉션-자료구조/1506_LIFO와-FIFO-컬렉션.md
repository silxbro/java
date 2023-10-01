# LIFO와 FIFO 컬렉션
<br/>

**후입선출(`LIFO`: Last In First Out)** 은 나중에 넣은 객체가 먼저 빠져나가고, **선입선출(`FIFO`: First In First Out)** 은 먼저 넣은 객체가 먼저 빠져나가는 구조를 말한다.
컬렉션 프레임워크는 **LIFO** 자료구조를 제공하는 **`스택(Stack)` 클래스**와 **FIFO** 자료구조를 제공하는 **`큐(Queue)` 인터페이스**를 제공하고 있다.
다음은 스택과 큐의 구조를 보여준다.

<img src="https://github.com/silxbro/java/assets/142463332/ed8b2ce8-9b35-41b4-bdf7-431adab6c847" width="550" height="200"/><br/>

스택을 응용한 대표적인 예가 JVM 스택 메모리이다. 스택 메모리에 저장된 변수는 나중에 저장된 것부터 제거된다.
큐를 응용한 대표적인 예가 스레드풀(ExecutorService)의 작업 큐이다. 작업 큐는 먼저 들어온 작업부터 처리한다.

<br/>

## Stack
**`Stack` 클래스**는 **LIFO 자료구조를 구현한 클래스**이다. 다음은 Stack 객체를 생성하는 방법이다.
```java
Stack<E> stack = new Stack<E>();
Stack<E> stack = new Stack<>();
```
다음은 Stack 클래스의 주요 메소드이다.

|리턴 타입|메소드|설명|
|:---|:---|:---|
|`E`|**push**(E item)|주어진 객체를 스택에 넣는다.|
|`E`|**pop**()|스택의 맨 위 객체를 빼낸다.|

<br/>

다음은 동전 케이스를 Stack 클래스로 구현한 예제이다. 동전 케이스는 위에만 오픈되어 있는 스택 구조를 가지고 있다.
먼저 넣은 동전은 제일 밑에 깔리고 나중에 넣은 동전이 위에 쌓이기 때문에 제일 위의 동전부터 빼낼 수 있다.
- [Coin.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch15/sec06/exam01/Coin.java)
- [StackExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch15/sec06/exam01/StackExample.java)

<br/>

## Queue
**`Queue` 인터페이스**는 **FIFO 자료구조**에서 사용되는 메소드를 정의하고 있다. 다음은 Queue 인터페이스에 정의되어 있는 메소드이다.

|리턴 타입|메소드|설명|
|:---|:---|:---|
|`boolean`|**offer**(E e)|주어진 객체를 큐에 넣는다.|
|`E`|**poll**()|큐에서 객체를 빼낸다.|

Queue 인터페이스를 **구현한 대표적인 클래스**는 **`LinkedList`** 이다. 그렇기 때문에 LinkedList 객체를 Queue 인터페이스 변수에 다음과 같이 대입할 수 있다.
```java
Queue<E> queue = new LinkedList<E>();
Queue<E> queue = new LinkedList<>();
```

<br/>

다음은 Queue를 이용해서 간단한 메시지 큐를 구현한 예제이다. 먼저 넣은 메시지가 반대쪽으로 먼저 나오기 때문에 넣은 순서대로 메시지가 처리된다.
- [Message.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch15/sec06/exam02/Message.java)
- [QueueExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch15/sec06/exam02/QueueExample.java)
