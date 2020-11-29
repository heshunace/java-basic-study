package priv.heshun.eight.enumtest;

/**
 * 使用Enum关键字定义枚举类
 * @author heshun
 * @create 2020-11-28 16:02
 */
public enum EnumTest {

    /**
     * 第一步即需要 提供当前枚举类的多个对象
     * 省略private final修饰
     */
    PERSON4("大张", "男", 25),
    PERSON5("小美", "女", 22),
    PERSON6("小张", "男", 18);

    /**
     * 声明EnumTest对象的属性
     * 省略private final修饰
     */
    String name;
    String sex;
    Integer age;

    /**
     * 构造方法
     * @param name
     * @param sex
     * @param age
     */
    EnumTest(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // 此处一般无需重写toString，默认的toString打印当前枚举类对象常量的名称

    public static void main(String[] args) {
        System.out.println(EnumTest.PERSON4);
        System.out.println(EnumTest.PERSON5);
        System.out.println(EnumTest.PERSON6);
    }
}
