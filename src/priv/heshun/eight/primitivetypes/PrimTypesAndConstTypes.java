package priv.heshun.eight.primitivetypes;

/**
 * 基本数据类型与常量的计算问题
 * @author heshun
 * @date 2020-10-26
 */
public class PrimTypesAndConstTypes {

    /*
        整型常量，默认类型为int型
        浮点型常量，默认类型为double型
     */

    public static void main(String[] args) {

        // long必须添加l(L)后缀，此处相当于是int型常量自动类型提升为long型并赋值
        // 故long型变量在int型范围内不加l后缀可以编译通过，但不符合实际意义
        long num1 = 123123;
        System.out.println(num1);
        // 编译失败，超出整型范围
        // long num2 = 123123123123;

        // 浮点型常量默认类型为double型，故此处无法赋值
        // 所以float不加f(F)后缀编译无法通过
        // float num3 = 1.23;
        float num3 = 1.23f;
        System.out.println(num3);

    }

}
