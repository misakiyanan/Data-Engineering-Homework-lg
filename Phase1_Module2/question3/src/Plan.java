/**
 * @Author: xie yanan
 */

public abstract class Plan {

    private int monthlyPrice;

    // constructor
    public Plan() { }
    public Plan(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    // setter
    public void setMonthlyPrice(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    // getter
    public int getMonthlyPrice() {
        return monthlyPrice;
    }

    public abstract void displayPlanInfo();

}

