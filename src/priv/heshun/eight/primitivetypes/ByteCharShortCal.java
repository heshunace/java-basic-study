package priv.heshun.eight.primitivetypes;

/**
 * byte、char、short三种类型的运算
 * @author heshun
 * @date 2020-10-26
 */
public class ByteCharShortCal {

    public static void main(String[] args) {
        byte num1 = 1;
        byte num2 = 2;

        /*
            当byte、char、short三种类型的变量做运算时，结果为int型
         */

        // 以下语句编译报错
        // byte num3 = num1 + num2;
        int num3 = num1 + num2;
        System.out.println(num3);

        short num4 = 4;
        // 以下语句编译报错
        // short num5 = num1 + num4;
        int num5 = num1 + num4;
        System.out.println(num5);

        char num6 = 'a';
        // 以下语句编译报错
        // char num7 = num1 + num6;
        int num7 = num1 + num6;
        System.out.println(num7);
    }


}
