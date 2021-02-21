/**
 * @Author: xie yanan
 * 通话套餐类
 * 特征：通话时长、短信条数、每月资费
 * 行为: 显示所有套餐信息
 */

public class CallPlan extends Plan implements CallService{

    private int callTotal;
    private int textTotal;

    // constructor
    public CallPlan() { }
    public CallPlan(int monthlyPrice, int callTotal, int textTotal) {
        super(monthlyPrice);
        setCallTotal(callTotal);
        setTextTotal(textTotal);
    }

    // setter
    public void setCallTotal(int callTotal) {
        this.callTotal = callTotal;
    }
    public void setTextTotal(int textTotal) {
        this.textTotal = textTotal;
    }

    // getter
    public int getCallTotal() {
        return callTotal;
    }
    public int getTextTotal() {
        return textTotal;
    }

    @Override
    public void displayPlanInfo() {
        System.out.println("【通话套餐信息】");
        System.out.println("通话时长：" + getCallTotal());
        System.out.println("短信条数：" + getTextTotal());
        System.out.println("每月资费：" + getMonthlyPrice());

    }

    @Override
    public void useCallService(int minute, SimCard simCard) {
        System.out.println("卡号为"+simCard.getSimNumber()+"的手机卡通话"+minute+"分钟");
        simCard.setCallUsage(simCard.getCallUsage()+minute);
    }
}
