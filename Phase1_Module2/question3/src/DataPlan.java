/**
 * @Author: xie yanan
 * 上网套餐类
 * 特征：上网流量、每月资费
 * 行为：显示所有套餐信息
 */

public class DataPlan extends Plan implements DataService{

    private int dataTotal;

    // constructor
    public DataPlan() { }
    public DataPlan(int monthlyPrice, int dataTotal) {
        super(monthlyPrice);
        setDataTotal(dataTotal);
    }

    // setter
    public void setDataTotal(int dataTotal) {
        this.dataTotal = dataTotal;
    }

    // getter
    public int getDataTotal() {
        return dataTotal;
    }

    @Override
    public void displayPlanInfo() {
        System.out.println("【上网套餐信息】");
        System.out.println("上网流量：" + getDataTotal());
        System.out.println("每月资费：" + getMonthlyPrice());
    }

    @Override
    public void useDataService(int data, SimCard simCard) {
        System.out.println("卡号为"+simCard.getSimNumber()+"的手机卡使用流量"+data+"MB");
        simCard.setDataUsage(simCard.getDataUsage()+data);
    }
}

