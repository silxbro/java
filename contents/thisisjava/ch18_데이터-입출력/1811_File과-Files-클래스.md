# File과 Files 클래스
<br/>

**`java.io` 패키지** 와 **`java.nio.file` 패키지** 는 파일과 디렉토리 정보를 가지고 있는 **`File`과 `Files` 클래스를 제공**한다.
Files는 File을 개선한 클래스로, 좀 더 많은 긴응을 가지고 있다.

<br/>

## File 클래스
File 클래스로부터 File 객체를 생성하는 방법은 다음과 같다.
```java
File file = new File("경로");
```

경로 구분자는 운영체제마다 조금씩 다르다. **윈도우**에서는 `\\` 또는 `/`를 둘 다 사용할 수 있고, **맥OS 및 리눅스**에서는 `/`를 사용한다.

다음은 윈도우에서 File 객체를 생성하는 코드이다.
```java
File file = new File("C:/Temp/file/txt");
File file = new File("C:\\Temp\\file.txt");
```
<br/>

File 객체를 생성했다고 해서 파일이나 디렉토리가 생성되는 것은 아니다. 그리고 경로에 실제 파일이나 디렉토리가 없더라도 예외가 발생하지 않는다.
파일이나 디렉토리가 **실제 있는지 확인**하고 싶다면 File 객체를 생성하고 나서 **`exists()` 메소드를 호출**해보면 된다.
```java
boolean isExist = file.exists();  // 파일이나 폴더가 존재한다면 true를 리턴
```
<br/>

exists() 메소드가 false를 리턴할 경우, 다음 메소드로 파일 또는 폴더를 생성할 수 있다.

|리턴 타입|메소드|설명|
|:---|:---|:---|
|`boolean`|**createNewFile**()|새로운 파일을 생성|
|`boolean`|**mkdir**()|새로운 디렉토리를 생성|
|`boolean`|**mkdirs**()|경로상에 없는 모든 디렉토리를 생성|

extists() 메소드의 리턴값이 true라면 다음 메소드를 사용할 수 있다.

|리턴 타입|메소드|설명|
|:---|:---|:---|
|`boolean`|**delete**()|파일 또는 리렉토리 삭제|
|`boolean`|**canExecute**()|실행할 수 있는 파일인지 여부|
|`boolean`|**canRead**()|읽을 수 있는 파일인지 여부|
|`boolean`|**canWrite**()|수정 및 저장할 수 있는 파일인지 여부|
|`String`|**getName**()|파일의 이름을 리턴|
|`Stirng`|**getParent**()|부모 디렉토리를 리턴|
|`File`|**getParentFile**()|부모 디렉토리를 File 객체로 생성 후 리턴|
|`String`|**getPath**()|전체 경로를 리턴|
|`boolean`|**isDirectory**()|디렉토리인지 여부|
|`boolean`|**isFile**()|파일인지 여부|
|`boolean`|**isHidden**()|숨김 파일인지 여부|
|`long`|**lastModified**()|마지막 수정 날짜 및 시간을 리턴|
|`long`|length()|파일의 크기 리턴|
|`String[]`|**list**()|디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를<br/>String 배열로 리턴|
|`String[]`|**list**(FilenameFilter filter)|디렉토리에 포함된 파일 및 서브 디렉토리 목록 중에<br/>FilenameFilter에 맞는 것만 String 배열로 리턴|
|`File[]`|**listFiles**()|디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를<br/>File 배열로 리턴|
|`File[]`|**listFiles**(FilenameFilter filter)|디렉토리에 포함된 파일 및 서브 디렉토리 목록 중에<br/>FilenameFilter에 맞는 것만 File 배열로 리턴|

<br/>

다음은 C:/Temp 디렉토리에 images 디렉토리와 file1.txt, file2.txt, file3.txt 파일을 생성하고, Temp 디렉토리에 있는 내용을 출력하는 예제이다.
- [FileExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch18/sec11/FileExample.java)
<br/>

#### [입출력 스트림을 생성할 때 File 객체 활용하기]
파일 또는 폴더의 정보를 얻기 위해 File 객체를 단독으로 사용할 수 있지만, **파일 입출력 스트림을 생성할 때 경로 정보를 제공**할 목적으로 사용되기도 한다.
```java
// 첫 번째 방법
FileInputStream fis = new FileInputStream("C:/Temp/image.gif");

// 두 번째 방법
File file = new File("C:/Temp/image.gif");
FileInputStream fis = new FileInputStream(file);
```

<br/>

## Files 클래스
Files 클래스는 **`정적` 메소드로 구성**되어 있기 때문에 File 클래스처럼 객체로 만들 필요가 없다.
Files의 정적 메소드는 **운영체제의 파일 시스템에게 파일 작업을 수행하도록 위임**한다.

다음은 Files 클래스가 가지고 있는 정적 메소드를 기능별로 정리한 표이다.

|기능|관련 메소드|
|:---|:---|
|**복사**|copy|
|**생성**|createDirectories, createDirectory, createFile, createLink,<br/>createSymbolicLink, createTempDirectory, createTempFile|
|**이동**|move|
|**삭제**|delete, deleteIfExists|
|**존재, 검색, 비교**&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|exists, notExists, find, mismatch|
|**속성**|getLastModifiedTime, getOwner, getPosixFilePermissions,<br/>isDirectory, isExecutable, isHidden, isReadable,<br/>isSymbolicLink, isWritbale, size,<br/>setAttribute, setLastModifiedTime, setOwner, setPosixFilePermissions,&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br/>probeContentType|
|**디렉토리 탐색**|list, newDirectoryStream, walk|
|**데이터 입출력**|newInputStream, newOutputStream,<br/>newBufferedReader, newBufferedWriter,<br/>readAllBytes, lines, readAllLines, readString, readSymbolicLink,<br/>write, writeString|

이 메소드들은 **매개값**으로 **`Path` 객체** 를 받는다.
Path 객체는 파일이나 디렉토리를 찾기 위한 **경로 정보**를 가지고 있는데, **정적** 메소드인 **`get()` 메소드**로 다음과 같이 얻을 수 있다.
```java
Path path = Paths.get(String first, String ... more)
```
get() 메소드의 매개값은 **파일 경로**인데, 전체 경로를 한꺼번에 지정해도 좋고 상위 디렉토리와 하위 디렉토리를 나열해서 지정해도 좋다.
- 다음은 "C:\Temp\dir\file.txt" 경로를 이용해서 Path 객체를 얻는 방법을 보여준다.

  ```java
  Path path = Paths.get("C:/Temp/dir/file.txt");
  Path path = Paths.get("C:/Temp/dir", "file.txt");
  Path path = Paths.get("C:", "Temp", "dir", "file.txt");
  ```
<br/>
파일의 경로는 절대 경로와 상대 경로를 모두 사용할 수 있다.

- 만약 현재 디렉토리의 위치가 "C:\Temp"일 경우 "C:\Temp\dir\file.txt"는 다음과 같이 지정이 가능하다.
  
  ```java
  Path path = Paths.get("dir/file.txt");
  Path path = Paths.get("./dir/file.txt");
  ```
- 현재 위치가 "C:\Temp\dir1"이라면 "C:\Temp\dir2\file.txt"는 다음과 같이 지정이 가능하다. `.`이 현재 디렉토리라면, `..`은 상위 디렉토리를 말한다.
  
  ```java
  Path path = Paths.get("../dir2/file.txt");
  ```

<br/>

다음 예제는 Files 클래스를 이용해서 C:\Temp 디렉토리에 user.txt 파일을 생성하고 읽는 방법을 보여준다.
- [FilesExample.java](https://github.com/silxbro/java/blob/main/src/thisisjava/ch18/sec11/FilesExample.java)
<br/>

**`probeContentType()` 메소드**는 파일 확장명에 따른 **파일 유형**을 리턴한다.
- 예를 들어, txt 파일은 text/plain으로, jpg 파일은 image/jpeg로 리턴한다.

Files는 **입출력 스트림을 사용하지 않아도 파일의 데이터를 쉽게 읽고 쓸 수 있다**.<br/>
**`writeString()` 메소드** 는 문자열을 파일에 저장하고, **`readString()` 메소드** 는 텍스트 파일의 내용을 전부 읽고 String으로 리턴한다.
