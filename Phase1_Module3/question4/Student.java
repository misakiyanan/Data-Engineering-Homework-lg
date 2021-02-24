package question4;

public class Student {
    private String name;
    private int age;
    private int studentID;

    // constructors
    public Student() { }
    public Student(int studentID, String name, int age) {
        setName(name);
        setStudentID(studentID);
        setAge(age);
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // https://www.candidjava.com/tutorial/java-program-to-calculate-age-from-date-of-birth/
    // calculate age based on birthdate
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getStudentID() {
        return studentID;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return studentID == student.studentID;
    }

    // hashCode
    @Override
    public int hashCode() {
        return studentID;
    }

    // toString
    @Override
    public String toString() {
        return "学生信息【" +
                "学号：" + studentID +
                "，  姓名：" + name +
                "，  年龄：" + age +
                '】';
    }
}
