package thisisjava.ch12.sec11.exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
  public static void main(String[] args) {
    Class clazz = Car.class;

    System.out.println("[생성자 정보]");
    Constructor[] constructors = clazz.getDeclaredConstructors();
    for (Constructor constructor : constructors) {
      System.out.print(constructor.getName() + "(");
      Class[] parameters = constructor.getParameterTypes();
      printParameters(parameters);
      System.out.println(")");
    }
    System.out.println();

    System.out.println("[필드 정보]");
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      System.out.println(field.getType().getName() + " " + field.getName());
    }
    System.out.println();

    System.out.println("[메소드 정보]");
    Method[] methods = clazz.getDeclaredMethods();
    for (Method method : methods) {
      System.out.print(method.getName() + "(");
      Class[] parameters = method.getParameterTypes();
      printParameters(parameters);
      System.out.println(")");
    }

    /*
    [생성자 정보]
    thisisjava.ch12.sec11.exam02.Car()
    thisisjava.ch12.sec11.exam02.Car(java.lang.String)

    [필드 정보]
    java.lang.String model
    java.lang.String owner

    [메소드 정보]
    getOwner()
    setOwner(java.lang.String)
    getModel()
    setModel(java.lang.String)
     */
  }

  private static void printParameters(Class[] parameters) {  // 생성자 및 메소드의 매개변수 정보를 출력
    for (int i=0; i<parameters.length; i++) {
      System.out.print(parameters[i].getName());
      if (i<(parameters.length-1)) {
        System.out.print(",");
      }
    }
  }
}
