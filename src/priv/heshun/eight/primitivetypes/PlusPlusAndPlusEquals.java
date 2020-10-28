package priv.heshun.eight.primitivetypes;

/**
 * ++ 和 += 运算
 * @author heshun
 * @date 2020-10-28
 */
public class PlusPlusAndPlusEquals {

    /*
        ++ 和 += 与传统的+不同
        它们不会改变变量本身的数据类型
     */

    public static void main(String[] args) {

        short num = 1;

        // 编译报错
        // num = num + 1;

        // 编译通过
        num++;
        System.out.println(num);

        // 编译通过
        num += 1;
        System.out.println(num);
    }

}
