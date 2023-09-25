package thisisjava.ch12.sec11.exam03;

public class GetResourceExample {
  public static void main(String[] args) {
    Class clazz = Car.class;

    String photo1Path = clazz.getResource("photo1.jpg").getPath();
    String photo2Path = clazz.getResource("images/photo2.jpg").getPath();

    System.out.println(photo1Path);  // /C:/Users/EHPARK/work/java_projects/java/out/production/java/thisisjava/ch12/sec11/exam03/photo1.jpg
    System.out.println(photo2Path);  // /C:/Users/EHPARK/work/java_projects/java/out/production/java/thisisjava/ch12/sec11/exam03/images/photo2.jpg
  }
}
