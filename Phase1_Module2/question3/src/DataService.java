/**
 * @Author: xie yanan
 * 上网服务接口
 * 抽象方法:
 * 参数1: 上网流量,
 * 参数2: 手机卡类对象 让上网套餐类实现上网服务接口。
 */

public interface DataService {
    public abstract void useDataService(int data, SimCard simCard);
}
