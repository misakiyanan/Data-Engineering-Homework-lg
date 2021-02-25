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
        System.out.println("   【1】 添加学生信息   "
                         + "   【2】 删除学生信息\n"
                         + "   【3】 修改学生信息   "
                         + "   【4】 查找学生信息\n"
                         + "   【5】 显示所有学生信息"
//                         + "   【6】 退出系统"
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
    public int nextOperationPrompt() {
        System.out.println("当前操作结束，返回菜单请输入【6】，退出系统请输入【7】");
        return sc.nextInt();
    }


    // add student
    public void addStudent (String operation) {
        System.out.println(">>> 进入"+operation+"学生信息界面");
        int studentID = idInputPrompt(operation);
        if (infosys.ifExists(studentID)) {
            System.out.println(">>> 该学号的学生已存在，不可重复添加");
            return;
        }
        String name = nameInputPrompt(operation);
        int age = ageInputPrompt(operation);
        infosys.addStudent(studentID, name, age);
    }

    // delete student
    public void deleteStudent (String operation) {
        System.out.println(">>> 进入"+operation+"学生信息界面");
        int studentID = idInputPrompt(operation);
        if (! infosys.ifExists(studentID)) {
            System.out.println(">>> 该学号的学生不存在,无法进行删除操作");
            return;
        }
        infosys.deleteStudent(studentID);
    }

    // update
    public void updateStudent (String operation) {
        System.out.println(">>> 进入"+operation+"学生信息界面");
        int oldID = idInputPrompt(operation);
        if (! infosys.ifExists(oldID)) {
            System.out.println(">>> 该学号的学生不存在,无法进行修改操作");
            return;
        }

        Student currentStudent = infosys.getByID(oldID);
        System.out.println(">>> 当前学生信息");
        System.out.println(currentStudent);

        int newID =   newIDInputPrompt(operation);
        String newName = newNameInputPrompt(operation);
        int newAge =  newAgeInputPrompt(operation);
        infosys.updateStudent(oldID,newID,newName,newAge);
    }

    // query
    public void queryStudent(String operation) {
        System.out.println(">>> 进入"+operation+"学生信息界面");

        int studentID = idInputPrompt(operation);
        if (! infosys.ifExists(studentID)) {
            System.out.println(">>> 该学号的学生不存在,无法进行查找操作");
            return;
        }

        infosys.queryStudent(studentID);
    }

    // display all
    public void displayAllStudents () {
        System.out.println(">>> 进入全体学生信息展示界面");
        infosys.getAllStudents();
    }

    // exit
    public void exitSystem() {
        System.out.println(">>> 已退出学生管理系统");
    }

    // switch page
    public void switchPage(int selection) {
        if (selection == 1) {addStudent("添加");}
        if (selection == 2) {deleteStudent("删除");}
        if (selection == 3) {updateStudent("修改");}
        if (selection == 4) {queryStudent("查询");}
        if (selection == 5) {displayAllStudents();}
//        if (selection == 6) {exitSystem();}
    }

    // run system
    public void run() {
//        do {
//            switchPage(selectOperation());
//        } while (nextOperationPrompt() == 7);
//        exitSystem();

        while(true) {
            switchPage(selectOperation());
            if (nextOperationPrompt() == 7) {
                exitSystem();
                break;
            }
        }
    }

}
