package question1;

public class IDAlreadyExistsException extends StudentIDException{
    @Override
    public void printStackTrace() {
        System.out.println("该学号已被占用，无法进行当前操作");
    }
}
