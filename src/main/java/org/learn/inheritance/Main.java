package org.learn.inheritance;

import org.learn.inheritance.models.Binusian;
import org.learn.inheritance.models.Instructor;
import org.learn.inheritance.models.Lecturer;
import org.learn.inheritance.models.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // you can create a student object and store it into Binusian class, because student inherit binusian
    Binusian student1 = new Student("student 1", "major 1", 1);
    Binusian student2 = new Student("student 2", "major 2", 2);
    Binusian lecturer1 = new Lecturer("lecturer 1", 1000);
    Binusian lecturer2 = new Lecturer("lecturer 2", 2000);
    Binusian instructor1 = new Instructor("instructor 1", "major 1", 1, 1000);

    // you can create an instructor object and store it into student class because instructor inherit student
    Student instructor2 = new Instructor("instructor 2", "major 2", 2, 2000);

    List<Binusian> binusianList = new ArrayList<>();

    // you can store student to the binusianList because student inherit binusian
    binusianList.add(student1);
    binusianList.add(student2);
    binusianList.add(lecturer1);
    binusianList.add(lecturer2);
    binusianList.add(instructor1);

    // even though instructor2 is stored into Student Class, but it still can be stored into binusianList because
    // instructor inherit student which inherit binusian
    // so student is parent class of instructor
    // and binusian is grand-parent class of instructor
    binusianList.add(instructor2);

    for(Binusian b: binusianList) {
      // all binusian share the same method
      System.out.printf("binusian id: %s\n", b.getId());
      System.out.printf("name: %s\n", b.getName());
      System.out.printf("type: %s\n", b.getType());


      // you can check is binusian instance of instructor by using instanceof
      if (b instanceof Instructor /* or using b.getType().isInstructor() */) {
        Instructor instructor = (Instructor) b;
        System.out.printf("instructor id: %s\n", instructor.getInstructorId());
        System.out.printf("student id: %s\n", instructor.getStudentId());
        System.out.printf("major: %s\n", instructor.getMajor());
        System.out.printf("semester: %s\n", instructor.getSemester());
        instructor.teach();
      } else if (b instanceof Student) {
        Student student = (Student) b;
        System.out.printf("student id: %s\n", student.getStudentId());
        System.out.printf("major: %s\n", student.getMajor());
        System.out.printf("semester: %s\n", student.getSemester());
      } else if(b instanceof Lecturer) {
        Lecturer lecturer = (Lecturer) b;
        System.out.printf("lecturer id: %s\n", lecturer.getLecturerId());
        System.out.printf("salary: %s\n", lecturer.getSalary());
        lecturer.teach();
      }
      System.out.println("======================================");
    }
  }
}
