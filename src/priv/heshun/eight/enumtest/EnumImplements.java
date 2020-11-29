package priv.heshun.eight.enumtest;

/**
 * 枚举类的对象分别实现接口中的抽象方法
 *
 * @author heshun
 * @create 2020-11-28 16:08
 */
public enum EnumImplements implements Printer {

    /**
     * 每一个枚举类的对象都实现了各自的抽象方法
     */
    PERSON8("大张", "男", 25) {
        @Override
        public void print() {
            System.out.println(name + sex + age);
        }
    },
    PERSON9("小美", "女", 22) {
        @Override
        public void print() {
            System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
        }
    },
    PERSON10("小张", "男", 18) {
        @Override
        public void print() {
            System.out.println("我的名字叫" + name + "，" + sex +
                    "，今年" + age + "岁了");
        }
    };

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
    EnumImplements(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // 此处一般无需重写toString，默认的toString打印当前枚举类对象常量的名称

    public static void main(String[] args) {
        EnumImplements.PERSON8.print();
        EnumImplements.PERSON9.print();
        EnumImplements.PERSON10.print();
    }
}


interface Printer {
    /**
     * 打印方法
     */
    void print();
}
