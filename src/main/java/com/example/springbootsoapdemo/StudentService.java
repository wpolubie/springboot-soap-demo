package com.example.springbootsoapdemo;

import com.example.springbootsoapdemo.student.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private List<Student> students;

    public StudentService() {
        students = new ArrayList<Student>();
        Student student1 = new Student();
        student1.setId(1L);
        student1.setName("Wojciech");
        student1.setSurname("Kowalski");

        Student student2 = new Student();
        student2.setId(2L);
        student2.setName("Aleksandra");
        student2.setSurname("Woźniak");

        students.add(student1);
        students.add(student2);
    }

    public Student getStudentById(long id) {
        return students
                .stream()
                .filter(student -> student.getId() == id)
                .findFirst().get();
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
