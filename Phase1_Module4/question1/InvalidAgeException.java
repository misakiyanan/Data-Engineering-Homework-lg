package question1;

public class InvalidAgeException extends Exception{
    @Override
    public void printStackTrace() {
        System.out.println("无效的年龄信息: 年龄需为4-60之间的整数");
    }
}
