package question4;

/*
 使用 List 集合实现简易的学生信息管理系统，要求打印字符界面提示用户选择相应的功能，
 根据用户输入的选择去实现增加、删除、修改、查找以及遍历所有学生信息的功能。
 其中学生的信息有：学号、姓名、年龄。 要求： 尽量将功能拆分为多个.java 文件。
 */

public class Main {
    public static void main(String[] args) {
        StudentInformationSystem infosys = new StudentInformationSystem();
        infosys.getAllStudents();
        Student s1 = new Student(23, "agwe",1342);
        infosys.addStudent(s1);
        infosys.getAllStudents();
        infosys.queryStudent(1342);
        Student s2 = new Student(23, "agwdage",123342);
        infosys.deleteStudent(23);
    }
}
