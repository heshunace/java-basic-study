package priv.heshun.eight.primitivetypes;

/**
 * String做连接运算
 * @author heshun
 * @date 2020-10-27
 */
public class StringPlus {

    /*
        出现String时，"+"为连接
        否则为加
     */

    public static void main(String[] args) {

        char a = 'a';
        int  b = 10;
        String c = "hello";
        // 第一个+为加，第二个+为连接
        System.out.println(a + b + c);
        // 括号优先级高，b+c做连接运算变为String，此时第一个+也变为连接
        System.out.println(a + (b + c));
        System.out.println(a + c + b);


        // 哪一个能输出"*  *"？
        System.out.println("*   *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));
    }

}
