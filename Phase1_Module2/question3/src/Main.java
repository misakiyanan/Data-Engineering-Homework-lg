/**
* @Author: xie yanan
*/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // initial prompt
        System.out.println(">>> 欢迎注册宇宙最简陋运营商兔国通联服务" +
                "\n>>> 兔国通联用户实行一人一号制度，坚决杜绝小号行为");
        System.out.println(">>> 开始注册");
        System.out.print("请设置用户名: ");
        String username = sc.next();
        System.out.print("请设置6位数字密码: ");
        int password = sc.nextInt();

        // init SimCard
        SimCard mySIM = new SimCard(username, password);

        // set card number
        int simNumber = rand.nextInt(100000) + 100000;
        mySIM.setSimNumber(simNumber);

        // set card type
        CardType type = CardType.MINI;
        mySIM.setType(type);

        // output message
        System.out.print("恭喜这位"+mySIM.getUsername()+"用户注册成功！");
        System.out.println("您的手机卡号为：" + mySIM.getSimNumber());
        System.out.println("手机卡的类型为：" + mySIM.getType().getCardType());
        System.out.println();

        // set balance
        int balance = 10000;
        mySIM.setBalance(balance);
        System.out.println(">>> 首次注册用户自动获得"+mySIM.getBalance()+"元余额！");
        System.out.println();

        // display user info
        System.out.println(">>> 假装进入手机卡信息查询界面");
        mySIM.displayCardInfo();
        System.out.println();

        // call plan
        System.out.println(">>> 假装开始购买通话套餐");
        CallPlan callPlan = new CallPlan(1000, 600, 200);
        mySIM.purchasePlan(callPlan);
        System.out.println();

        // data plan
        System.out.println(">>> 假装开始购买通话套餐");
        DataPlan dataPlan = new DataPlan(2000, 600);
        mySIM.purchasePlan(dataPlan);
        System.out.println();

        // use call service
        System.out.println(">>> 假装打电话");
        callPlan.useCallService(10, mySIM);
        System.out.println();

        // use data service
        System.out.println(">>> 假装上网");
        dataPlan.useDataService(20, mySIM);
        System.out.println();

        // use call service again
        System.out.println(">>> 假装再次打电话");
        callPlan.useCallService(30, mySIM);
        System.out.println();

        // use data service again
        System.out.println(">>> 假装再次上网");
        dataPlan.useDataService(40, mySIM);
        System.out.println();

        // stats
        System.out.println(">>> 假装查询本月消费信息");
        UserConsumptionInfo stats = new UserConsumptionInfo(mySIM);
        stats.monthlyStats();

    }
}
