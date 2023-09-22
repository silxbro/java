package thisisjava.ch11.sec05;

public class ThrowsExample2 {
  public static void main(String[] args) throws Exception {
    findClass();

    /*
    Exception in thread "main" java.lang.ClassNotFoundException: java.lang.String2
	    at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	    at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	    at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	    at java.base/java.lang.Class.forName0(Native Method)
	    at java.base/java.lang.Class.forName(Class.java:383)
	    at java.base/java.lang.Class.forName(Class.java:376)
	    at thisisjava.ch11.sec05.ThrowsExample2.findClass(ThrowsExample2.java:9)
	    at thisisjava.ch11.sec05.ThrowsExample2.main(ThrowsExample2.java:5)
     */
  }

  public static void findClass() throws ClassNotFoundException {
    Class.forName("java.lang.String2");
  }
}
