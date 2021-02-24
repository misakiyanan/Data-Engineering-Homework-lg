package question4;

import java.util.Scanner;

public class UserInterface {
    Scanner sc = new Scanner(System.in);
    StudentInformationSystem infosys = new StudentInformationSystem();

    public void welcome() {
        System.out.println("欢迎进入学生信息管理系统！");
    }

    public int selectOperation() {
        System.out.println(">>> 请输入对应的序号进入下一步操作");
        System.out.println("   【1】 添加学生信息"
                         + "   【2】 删除学生信息"
                         + "   【3】 修改学生信息"
                         + "   【4】 查找学生信息"
                         + "   【5】 显示所有学生信息"
                         + "   【6】 退出系统"
        );
        return sc.nextInt();
    }

    // User input prompts
    public int idInputPrompt(String operation) {
        System.out.println("请输入要"+operation+"的学生学号：");
        return sc.nextInt();
    }
    public String nameInputPrompt(String operation) {
        System.out.println("请输入要"+operation+"的学生姓名：");
        return sc.next();
    }
    public int ageInputPrompt(String operation) {
        System.out.println("请输入要"+operation+"的学生年龄：");
        return sc.nextInt();
    }
    public int newIDInputPrompt(String operation) {
        System.out.println("请输入"+operation+"后的学生学号：");
        return sc.nextInt();
    }
    public String newNameInputPrompt(String operation) {
        System.out.println("请输入"+operation+"后的学生姓名：");
        return sc.next();
    }
    public int newAgeInputPrompt(String operation) {
        System.out.println("请输入"+operation+"后的学生年龄：");
        return sc.nextInt();
    }


    // add student
    public void addStudent (String operation) {
        operation = "添加";
        System.out.println(">>> 进入"+operation+"学生信息界面");
        Student student = new Student(
                idInputPrompt(operation),
                nameInputPrompt(operation),
                ageInputPrompt(operation));
        infosys.addStudent(student);
    }

    // delete student
    public void deleteStudent (String operation) {
        operation = "删除";
        System.out.println(">>> 进入"+operation+"学生信息界面");
        infosys.deleteStudent(idInputPrompt(operation));
    }

    // update
    public void updateStudent (String operation) {
        operation = "修改";
        System.out.println(">>> 进入"+operation+"学生信息界面");
        infosys.updateStudent(
                idInputPrompt(operation),
                newIDInputPrompt(operation),
                newNameInputPrompt(operation),
                newAgeInputPrompt(operation));
    }

    // query
    public void queryStudent(String operation) {
        operation = "查询";
        System.out.println(">>> 进入"+operation+"学生信息界面");
        infosys.queryStudent(idInputPrompt(operation));
    }

    // display all
    public void displayAllStudents () {
        System.out.println(">>> 进入全体学生信息展示界面");
        infosys.getAllStudents();
    }

}
