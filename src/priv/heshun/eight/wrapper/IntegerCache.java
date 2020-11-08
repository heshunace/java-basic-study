package priv.heshun.eight.wrapper;

/**
 * IntegerCache结构
 * @author heshun
 * @date 2020-11-08
 */
public class IntegerCache {

    public static void main(String[] args) {

        /*
            Integer内部定义了IntegerCache结构
            IntegerCache中定义了Integer[]，保存了从-128~127范围的整数。
            如果我们使用自动装箱的方式，给Ingeter赋值的范围在-128~127时，
            可以直接使用数组中的元素，不用再去new
         */
        Integer num1 = new Integer(1);
        Integer num2 = new Integer(1);
        System.out.println(num1 == num2);

        Integer num3 = 1;
        Integer num4 = 1;
        System.out.println(num3 == num4);

        /**
         * 超过-127~128的范围，自动装箱时需要new
         */
        Integer num5 = 128;
        Integer num6 = 128;
        System.out.println(num5 == num6);

    }

}
