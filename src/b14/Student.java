package b14;

public class Student {
  private String name;
  private int age;
  private String address;

  public Student(String name) {
    this.name = name;
  }

  public Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Student(String name, int age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }
}
