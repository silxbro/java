package thisisjava.ch17.sec07.exam01;

public class Student implements Comparable<Student> {
  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public String getName() { return name; }
  public int getScore() { return score; }

  @Override
  public int compareTo(Student o) {
    return Integer.compare(score, o.score); // score과 o.score가 같을 경우 0을 리턴, 작을 경우 음수 리턴, 클 경우 양수 리턴
  }
}
