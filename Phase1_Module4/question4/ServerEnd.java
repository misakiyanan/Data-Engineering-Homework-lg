package question4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEnd {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        BufferedReader br = null;

        User user = new User("admin", "123456");
        UserMessage tum = new UserMessage("check", user);

        try {
            ss = new ServerSocket(8888);
            System.out.println(">>> 等待客户端的连接请求...");
            s = ss.accept();
            System.out.println(">>> 客户端连接成功！");

            // accept Strings from client
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String acceptUserName = br.readLine();
            String acceptPassword = br.readLine();
            System.out.println("客户端发来的用户名： " + acceptUserName);
            System.out.println("客户端发来的密码 ：  " + acceptPassword);

            // check if matches
            if (acceptUserName.equals(user.getUserName())
                    && acceptPassword.equals(user.getPassword())) {
                tum.setType("success");
                System.out.println(tum.getType() + "！ 登录成功");
            } else {
                tum.setType("fail");
                System.out.println(tum.getType() + "！ 用户名密码验证失败，无法登录");
            }



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
            if (null != ss) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }
}
