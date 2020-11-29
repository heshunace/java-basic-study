package priv.heshun.eight.date;

import java.util.Date;

/**
 * Date的简单使用
 * 两个构造器、两个方法
 * @author heshun
 * @create 2020-11-26-9:26
 **/
public class DateTest {

    public static void main(String[] args) {
        // 返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差，即“时间戳”
        long time = System.currentTimeMillis();
        System.out.println(time);

        // 构造器一：Date无参构造器
        // 创建一个对应当前时间的Date对象
        Date date = new Date();
        // 同System.currentTimeMillis()
        System.out.println(date.getTime());
        // 显示当前的年、月、日、时、分、秒
        System.out.println(date.toString());
        System.out.println();

        // 构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1606355349181L);
        System.out.println(date2.toString());
    }

}
