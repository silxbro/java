package thisisjava.ch11.sec02.exam02;

public class ExceptionHandlingExample {

  public static void main(String[] args) {
    try {
      Class.forName("java.lang.String");   // ClassNotFoundException 발생 가능 코드
      System.out.println("java.lang.String 클래스가 존재합니다.");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println();

    try {
      Class.forName("java.lang.String2");  // ClassNotFoundException 발생 가능 코드
      System.out.println("java.lang.String2 클래스가 존재합니다.");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    /*
    java.lang.String 클래스가 존재합니다.

    java.lang.ClassNotFoundException: java.lang.String2
	    at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	    at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	    at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	    at java.base/java.lang.Class.forName0(Native Method)
	    at java.base/java.lang.Class.forName(Class.java:383)
	    at java.base/java.lang.Class.forName(Class.java:376)
	    at thisisjava.ch11.sec02.exam02.ExceptionHandlingExample.main(ExceptionHandlingExample.java:16)
     */
  }
}
