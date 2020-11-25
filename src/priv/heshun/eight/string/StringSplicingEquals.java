package priv.heshun.eight.string;

/**
 * String拼接操作后，对结果值进行==判断
 *
 * 常量与常量的拼接结果在常量池中，且常量池中不会存在相同内容的常量
 * *** 只要其中有一个是变量，结果就在堆中 ***
 *
 * @author heshun
 * @create 2020-11-26 00:08
 */
public class StringSplicingEquals {

    public static void main(String[] args) {
        String s1 = "helloworld";
        // 常量与常量的拼接
        String s2 = "hello" + "world";
        String s3 = "hello";
        String s4 = "world";
        // s5、s6、s7中均有一个或多个常量
        String s5 = s3 + "world";
        String s6 = "hello" + s4;
        String s7 = s3 + s4;
        System.out.println(s1 == s2);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println(s1 == s7);

        // s8此处声明为final，即s8是常量而非变量
        final String s8 = "hello";
        String s9 = s8 + "world";
        System.out.println(s1 == s9);

        // 如果拼接的结果调用intern()方法，返回值就在常量池中
        System.out.println(s1 == s7.intern());
    }
}
