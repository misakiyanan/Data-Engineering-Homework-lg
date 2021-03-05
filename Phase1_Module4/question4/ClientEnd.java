package question4;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientEnd {
    public static void main(String[] args) {
        String userName;
        String password;
        Scanner sc =  new Scanner(System.in);
        PrintStream ps = null;

        Socket s = null;
        try {
            s = new Socket("192.168.2.106", 8888);
            System.out.println(">>> 连接服务器成功！");

            // send String to server
            System.out.println(">>> 请输入用户名");
            userName = sc.next();
            System.out.println(">>> 请输入密码");
            password = sc.next();

            ps = new PrintStream(s.getOutputStream());
            ps.println(userName);
            ps.println(password);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ps) {
                ps.close();
            }

        }


    }
}
