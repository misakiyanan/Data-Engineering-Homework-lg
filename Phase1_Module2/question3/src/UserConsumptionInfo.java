/**
 * @Author: xie yanan
 * 用户消费信息类
 * 特征：统计通话时长、统计上网流量、每月消费金额
 */

public class UserConsumptionInfo {

    private SimCard simCard;

    // constructors
    public UserConsumptionInfo() { }
    public UserConsumptionInfo(SimCard simCard) {
        setSimCard(simCard);
    }

    // setter
    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    // getter
    public SimCard getSimCard() {
        return simCard;
    }

    // print stats
    public void monthlyStats(){
        int cardNumber = getSimCard().getSimNumber();
        int call = getSimCard().getCallUsage();
        int data = getSimCard().getDataUsage();
        int amount = getSimCard().getTotalAmount();

        System.out.println("【月度消费信息统计】");
        System.out.println("手机号：     " + cardNumber);
        System.out.println("总计通话时长：" + call + "分钟");
        System.out.println("总计上网流量：" + data + "MB");
        System.out.println("总计消费金额：" + amount + "元");
    }
}
