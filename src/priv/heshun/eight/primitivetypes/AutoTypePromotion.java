package priv.heshun.eight.primitivetypes;

/**
 * 基本数据类型运算：自动类型提升
 * @author heshun
 * @date 2020-10-26
 */
public class AutoTypePromotion {

    public static void main(String[] args) {
        byte num1 = 1;
        int  num2 = 2;

        //以下语句编译报错
        // byte num3 = num1 + num2;

        /*
            自动类型提升：
            当容量小的数据类型的变量与容量大的数据类型的变量做运算时，
            结果自动提升为容量大的数据类型

            顺序：byte、short、int、long、float、double
         */
        int num3 = num1 + num2;
        System.out.println(num3);
    }

}
