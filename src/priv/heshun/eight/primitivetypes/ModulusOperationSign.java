package priv.heshun.eight.primitivetypes;

/**
 * 取模运算的符号问题
 * @author heshun
 * @date 2020-10-28
 */
public class ModulusOperationSign {

    /*
        结论：取模运算结果的符号与被模数的符号一致
     */

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 5;
        System.out.println("num1 % num2 = " + num1 % num2);

        int num3 = -12;
        int num4 = 5;
        System.out.println("num3 % num4 = " + num3 % num4);

        int num5 = 12;
        int num6 = -5;
        System.out.println("num5 % num6 = " + num5 % num6);

        int num7 = -12;
        int num8 = -5;
        System.out.println("num7 % num8 = " + num7 % num8);


    }

}
