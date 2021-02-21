
/**
 * @Author: xie yanan
 * 枚举类
 * 手机卡的类型总共有 3 种：大卡、小卡、微型卡
 */

public enum CardType {
    MINI("微型卡"), SMALL("小型卡"), LARGE("大型卡");
    private final String desc;

    private CardType(String desc) {
        this.desc = desc;
    }

    public String getCardType() {
        return desc;
    }

}
