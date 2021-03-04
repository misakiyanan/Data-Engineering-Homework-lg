package question1;

public class InvalidIDException extends StudentIDException{
    @Override
    public void printStackTrace() {
        System.out.println("无效的学号信息：学号需为大于0的整数");
    }
}
