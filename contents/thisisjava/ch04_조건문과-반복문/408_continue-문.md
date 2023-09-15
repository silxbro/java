# continue 문
<br/>

**`continue 문`** 은 **반복문**인 for 문, while 문, do-while 문에서만 사용되는데, 블록 내부에서 continue 문이 실행되면 for 문의 `증감식` 또는 while 문, do-while 문의 `조건식`으로 바로 이동한다.
다음은 continue 문의 실행 흐름을 보여준다.

<img src="https://github.com/silxbro/java/assets/142463332/e62dadd2-3b09-4e6f-8e2c-edcd9bb13ed8" width="400" height="150"/>

continue 문은 **반복문을 종료하지 않고 계속 반복을 수행**한다는 점이 break 문과 다르다. break 문과 마찬가지로 continue 문도 대개 if 문과 같이 사용되는데,
특정 조건을 만족하는 경우에 continue 문을 실행해서 그 이후의 문장을 실행하지 않고 다음 반복으로 넘어간다.

다음 예제는 1에서 10 사이의 수 중에서 짝수만 출력하고 홀수인 경우에는 다음 반복으로 넘어간다.
- [ContinueExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch04/sec08/ContinueExample.java)
