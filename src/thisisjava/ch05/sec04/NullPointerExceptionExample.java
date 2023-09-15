package thisisjava.ch05.sec04;

public class NullPointerExceptionExample {
  public static void main(String[] args) {
    int[] intArray = null;
    //intArray[0] = 10;   // NullPointerException

    /*
    Exception in thread "main" java.lang.NullPointerException: Cannot store to int array because "intArray" is null
	  at thisisjava.ch05.sec04.NullPointerExceptionExample.main(NullPointerExceptionExample.java:6)
     */

    String str = null;
    System.out.println("총 문자 수: " + str.length());  // NullPointerException

    /*
    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
	  at thisisjava.ch05.sec04.NullPointerExceptionExample.main(NullPointerExceptionExample.java:14)
     */
  }
}
