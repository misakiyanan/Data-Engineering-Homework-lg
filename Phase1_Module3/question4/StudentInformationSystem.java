package question4;

import java.util.ArrayList;
import java.util.List;

public class StudentInformationSystem {
    private List<Student> allStudents = new ArrayList<> ();

    // check if a student already exists and overload
    public boolean ifExists(Student student) {
        return allStudents.contains(student);
    }
    public boolean ifExists(int studentID) {
        Student s = new Student();
        s.setStudentID(studentID);
        return ifExists(s);
    }


    // get a student by ID
    public Student getByID(int studentID) {
        Student tempStudent = new Student();
        //tempStudent.setStudentID(studentID);
        for (Student oneStudent : allStudents) {
            if (oneStudent.getStudentID() == studentID) {
                return oneStudent;
            }
        }
        return null;
    }


    // add a student
    public void addStudent(int studentID, String studentName, int studentAge) {
        Student student = new Student(studentID, studentName, studentAge);
        if (allStudents.add(student)) {
            System.out.println(">>> 已成功添加当前学生");
        }
    }


    // delete a student
    public void deleteStudent(int studentID) {
        Student student = getByID(studentID);
        if (allStudents.remove(student)) {
            System.out.println(">>> 已成功删除当前学生");
        }
    }


    // update a student
    public void updateStudent(int oldStudentID, int newStudentID, String newName, int newAge) {
        Student currentStudent = getByID(oldStudentID);
        currentStudent.setStudentID(newStudentID);
        currentStudent.setName(newName);
        currentStudent.setAge(newAge);
        System.out.println(">>> 已成功修改，当前信息为：");
        System.out.println(currentStudent);
    }


    // query a student by ID
    public void queryStudent(int studentID) {
        Student student = getByID(studentID);
        System.out.println(">>> 查询结果");
        System.out.println(student);
    }


    // get all students
    public void getAllStudents() {
        if (allStudents.size() == 0) {
            System.out.println(">>> 当前系统内学生数为0");
            return;
        }
        System.out.println(">>> 当前系统内所有学生信息如下：");
        for (Student student: allStudents) {
            System.out.println(student);
        }
    }

}
