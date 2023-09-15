# break 문
<br/>

**`break 문`** 은 반복적인 for 문, while 문, do-while 문을 **실행 중지**하거나 조건문인 switch 문을 **종료**할 때 사용한다. 다음은 반복문에서 break 문을 사용할 때의 실행 흐름을 보여준다.

<img src="https://github.com/silxbro/java/assets/142463332/2f520312-d108-49de-bcc7-077cca487bed" width="400" height="150"/>

break 문은 대개 if 문과 같이 사용되어 조건식에 따라 for 문과 while 문을 종료한다.

다음 예제는 while 문을 이용해서 주사위 번호 중 하나를 반복적으로 뽑되, 6이 나오면 while 문을 종료시킨다.
- [BreakExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec07/BreakExample.java)

만약 반복문이 중첩되어 있을 경우 break 문은 **가장 가까운 반복문만 종료하고 바깥쪽 반복문은 종료시키지 않는다.**
중첩된 반복문에서 바깥쪽 반복문까지 종료시키려면 **바깥쪽 반복문에 이름(레이블)을 붙이고**, `break 이름;`을 사용하면 된다.

<img src="https://github.com/silxbro/java/assets/142463332/beea916f-582b-4a6c-92b8-5a64d4fd4495" width="450" height="200"/>

다음 예제를 보면 바깥쪽 for 문은 'A'~'Z'까지 반복하고, 중첩된 for 문은 'a'~'z'까지 반복한다. 중첩된 for 문에서 lower 변수가 'g'를 갖게 되면 바깥쪽 for 문까지 빠져나오도록 바깥쪽
for문에 Outter라는 라벨을 붙였다.
- [BreakOutterExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec07/BreakOutterExample.java)
