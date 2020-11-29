package priv.heshun.eight.enumtest;

/**
 * Enum类中的常用方法
 * @author heshun
 * @create 2020-11-28 16:03
 */
public class EnumMethodTest {

    public static void main(String[] args) {

        // values():返回枚举类型的对象数组，该方法可以很方便地遍历所有枚举值
        for (EnumTest value : EnumTest.values()) {
            System.out.println(value);
        }
        System.out.println("*******");

        // valueOf():可以把一个字符串转为对应的枚举类常量
        // 要求字符串必须是枚举对象的"名字"；否则，会出现IllegalArgumentException:
        System.out.println(EnumTest.valueOf("PERSON4"));
        // System.out.println(EnumTest.valueOf("PERSON7"));
        System.out.println("*******");

        // toString():打印当前枚举类对象常量的名称
        System.out.println(EnumTest.PERSON4.toString());
    }
}
