/**
 * @Author: xie yanan
 * 通话服务接口
 * 抽象方法: 参数1: 通话分钟, 参数2: 手机卡类对象
 * 让通话套餐类实现通话服务接口。
*/
public interface CallService {
    public abstract void useCallService(int minute, SimCard simCard);
}
