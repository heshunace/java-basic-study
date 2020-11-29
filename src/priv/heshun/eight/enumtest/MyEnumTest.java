package priv.heshun.eight.enumtest;

/**
 * @author heshun
 * @create 2020-11-28 16:02
 */
public class MyEnumTest {

    /**
     * 声明EnumTest对象的属性，private final修饰
     */
    public final String name;
    public final String sex;
    public final Integer age;

    /**
     * 私有化类的构造方法
     * @param name
     * @param sex
     * @param age
     */
    private MyEnumTest(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 提供当前枚举类的多个对象，public static final修饰
     */
    public static final MyEnumTest PERSON1 = new MyEnumTest("大张", "男", 25);
    public static final MyEnumTest PERSON2 = new MyEnumTest("小美", "女", 22);
    public static final MyEnumTest PERSON3 = new MyEnumTest("小张", "男", 18);

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  "姓名为：'" + name + '\'' +
                ", 性别为：'" + sex + '\'' +
                ", 年龄为：" + age +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(MyEnumTest.PERSON1);
        System.out.println(MyEnumTest.PERSON2);
        System.out.println(MyEnumTest.PERSON3);
    }
}
