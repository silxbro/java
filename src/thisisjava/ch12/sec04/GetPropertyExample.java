package thisisjava.ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
  public static void main(String[] args) {
    // 운영체제와 사용자 정보 출력
    String osName = System.getProperty("os.name");
    String userName = System.getProperty("user.name");
    String userHome = System.getProperty("user.home");
    System.out.println(osName);
    System.out.println(userName);
    System.out.println(userHome);

    // 전체 키와 값을 출력
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
    System.out.println("                                key     :  value");
    System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");
    Properties props = System.getProperties();
    Set keys = props.keySet();
    for (Object objKey : keys) {
      String key = (String) objKey;
      String value = System.getProperty(key);
      System.out.printf("%-40s: %s\n", key, value);
    }

    /*
    --------------------------------------------------------------------------------------------------------------------------------------------
                                    key     :  value
    --------------------------------------------------------------------------------------------------------------------------------------------
    java.specification.version              : 18
    sun.cpu.isalist                         : amd64
    sun.jnu.encoding                        : MS949
    java.class.path                         : C:\Users\EHPARK\work\java_projects\java\out\production\java;C:\lombok.jar
    java.vm.vendor                          : Oracle Corporation
    sun.arch.data.model                     : 64
    user.variant                            :
    java.vendor.url                         : https://java.oracle.com/
    java.vm.specification.version           : 18
    os.name                                 : Windows 11
    sun.java.launcher                       : SUN_STANDARD
    user.country                            : KR
    sun.boot.library.path                   : C:\Program Files\Java\jdk-18.0.2.1\bin
    sun.java.command                        : thisisjava.ch12.sec04.GetPropertyExample
    jdk.debug                               : release
    sun.cpu.endian                          : little
    user.home                               : C:\Users\EHPARK
    user.language                           : ko
    sun.stderr.encoding                     : UTF-8
    java.specification.vendor               : Oracle Corporation
    java.version.date                       : 2022-08-18
    java.home                               : C:\Program Files\Java\jdk-18.0.2.1
    file.separator                          : \
    java.vm.compressedOopsMode              : Zero based
    sun.stdout.encoding                     : UTF-8
    line.separator                          :

    java.vm.specification.vendor            : Oracle Corporation
    java.specification.name                 : Java Platform API Specification
    user.script                             :
    sun.management.compiler                 : HotSpot 64-Bit Tiered Compilers
    java.runtime.version                    : 18.0.2.1+1-1
    user.name                               : EHPARK
    path.separator                          : ;
    os.version                              : 10.0
    java.runtime.name                       : Java(TM) SE Runtime Environment
    file.encoding                           : UTF-8
    java.vm.name                            : Java HotSpot(TM) 64-Bit Server VM
    java.vendor.url.bug                     : https://bugreport.java.com/bugreport/
    java.io.tmpdir                          : C:\Users\EHPARK\AppData\Local\Temp\
    java.version                            : 18.0.2.1
    user.dir                                : C:\Users\EHPARK\work\java_projects\java
    os.arch                                 : amd64
    java.vm.specification.name              : Java Virtual Machine Specification
    sun.os.patch.level                      :
    native.encoding                         : MS949
    java.library.path                       : C:\Program Files\Java\jdk-18.0.2.1\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Zulu\zulu-17\bin\;C:\Oracle\WINDOWS.X64_193000_db_home\bin;C:\Program Files\Java\jdk-17.0.8.7\bin;C:\Program Files\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\Git\cmd;C:\Program Files\Java\jdk-18.0.2.1\bin;C:\Users\EHPARK\AppData\Local\Programs\Python\Python39\Scripts\;C:\Users\EHPARK\AppData\Local\Programs\Python\Python39\;C:\Users\EHPARK\AppData\Local\Microsoft\WindowsApps;C:\Program Files\JetBrains\IntelliJ IDEA 2023.1.4\bin;;;C:\Users\EHPARK\AppData\Local\Programs\Microsoft VS Code\bin;.
    java.vm.info                            : mixed mode, sharing
    java.vendor                             : Oracle Corporation
    java.vm.version                         : 18.0.2.1+1-1
    sun.io.unicode.encoding                 : UnicodeLittle
    java.class.version                      : 62.0

     */
  }
}
