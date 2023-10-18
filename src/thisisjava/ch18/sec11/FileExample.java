package thisisjava.ch18.sec11;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileExample {
  public static void main(String[] args) throws Exception {
    // File 객체 생성
    File dir = new File("C:/Temp/images");
    File file1 = new File("C:/Temp/file1.txt");
    File file2 = new File("C:/Temp/file2.txt");
    File file3 = new File("C:/Temp/file3.txt");

    // 존재하지 않으면 디렉토리 또는 파일 생성
    if (dir.exists() == false) { dir.mkdirs(); }
    if (file1.exists() == false) { file1.createNewFile(); }
    if (file2.exists() == false) { file2.createNewFile(); }
    if (file3.exists() == false) { file3.createNewFile(); }

    // Temp 폴더의 내용을 출력
    File temp = new File("C:/Temp");
    File[] contents = temp.listFiles();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
    for (File file : contents) {
      System.out.printf("%-25s", sdf.format(file.lastModified()));
      if (file.isDirectory()) {
        System.out.printf("%-10s%-20s", "<DIR>", file.getName());
      } else {
        System.out.printf("%-10s-20s", file.length(), file.getName());
      }
      System.out.println();
    }

    /*
    2022-03-29 오후 20:44      <DIR>     2020
    2023-04-13 오후 20:06      <DIR>     abc
    2023-09-23 오후 20:39      <DIR>     AUtempR
    2023-04-13 오후 20:08      <DIR>     bcd
    2023-10-18 오전 07:48      5760      -20s
    2023-08-23 오후 15:14      0         -20s
    2023-08-23 오후 15:14      0         -20s
    2023-08-23 오후 15:14      0         -20s
    ...
     */
  }
}
