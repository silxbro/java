package thisisjava.ch08.sec09;

public class ExtendsExample {
  public static void main(String[] args) {
    InterfaceCImpl impl = new InterfaceCImpl();

    InterfaceA ia = impl;
    ia.methodA();
    //ia.methodB();
    System.out.println();

    InterfaceB ib = impl;
    //ib.methodA();
    ib.methodB();
    System.out.println();

    InterfaceC ic = impl;
    ic.methodA();
    ic.methodB();
    ic.methodC();

    /*
    InterfaceCImpl-methodA() 실행

    InterfaceCImpl-methodB() 실행

    InterfaceCImpl-methodA() 실행
    InterfaceCImpl-methodB() 실행
    InterfaceCImpl-methodC() 실행
     */
  }
}
