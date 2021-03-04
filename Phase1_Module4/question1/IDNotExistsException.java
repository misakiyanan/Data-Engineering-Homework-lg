package question1;

public class IDNotExistsException extends StudentIDException{
    @Override
    public void printStackTrace() {
        System.out.println("该学生不存在，无法进行当前操作");
    }
}
