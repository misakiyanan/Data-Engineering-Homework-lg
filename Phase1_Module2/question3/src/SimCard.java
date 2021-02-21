/**
 * @Author: xie yanan
 * 手机卡类
 * 特征：卡类型、卡号、用户名、密码、账户余额、通话时长(分钟)、上网流量
 * 行为：显示（卡号 + 用户名 + 当前余额）
 */

public class SimCard {
    private int simNumber;
    private String username;
    private int password;
    private CardType type;
    private int balance;
    private int callUsage;
    private int dataUsage;

    private int totalAmount;

    // constructor
    public SimCard() { }

    public SimCard(String username, int password) {
        this.username = username;
        this.password = password;
    }

    // setters
    public void setSimNumber(int simNumber) {
        this.simNumber = simNumber;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setType(CardType type) {
        this.type = type;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public void setCallUsage(int callUsage) {
        this.callUsage = callUsage;
    }
    public void setDataUsage(int dataUsage) {
        this.dataUsage = dataUsage;
    }
    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    // getters
    public int getSimNumber() {
        return simNumber;
    }
    public String getUsername() {
        return username;
    }
    public int getBalance() {
        return balance;
    }
    public CardType getType() {
        return type;
    }
    public int getPassword() {
        return password;
    }
    public int getCallUsage() {
        return callUsage;
    }
    public int getDataUsage() {
        return dataUsage;
    }
    public int getTotalAmount() {
        return totalAmount;
    }


    public void displayCardInfo() {
        System.out.println("【手机卡信息】");
        System.out.println("卡号：" + getSimNumber());
        System.out.println("类型：" + getType().getCardType());
        System.out.println("用户名：" + getUsername());
        System.out.println("当前余额：" + getBalance());
    }

    public void purchasePlan(Plan plan) {
        //System.out.println("购买套餐");
        plan.displayPlanInfo();
        setBalance(getBalance() - plan.getMonthlyPrice());
        System.out.println("恭喜你购买成功，"
                        + "已扣除套餐费用" + plan.getMonthlyPrice()+"元，"
                        + "当前账户余额" + getBalance()+"元");
        setTotalAmount(getTotalAmount() + plan.getMonthlyPrice());
    }
}
