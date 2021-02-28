// SOUMYA DEY, 704, 5TH SEM, COMPUTER SCIENCE DEPT.

package soumya.model;

import java.io.Serializable;

public class Student implements Serializable {
  private static final long serialVersionUID = 1L;
  
  private String studentName;
  private int studentAge;
  private double studentGPA;
  
  public Student() {
  }

  public Student(String studentName, int studentAge, double studentGPA) {
    this.studentName = studentName;
    this.studentAge = studentAge;
    this.studentGPA = studentGPA;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public int getStudentAge() {
    return studentAge;
  }

  public void setStudentAge(int studentAge) {
    this.studentAge = studentAge;
  }

  public double getStudentGPA() {
    return studentGPA;
  }

  public void setStudentGPA(double studentGPA) {
    this.studentGPA = studentGPA;
  }
  
}
