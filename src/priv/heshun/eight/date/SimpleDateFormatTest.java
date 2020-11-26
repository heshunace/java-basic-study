package priv.heshun.eight.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat的简单使用
 * 实例化、格式化、解析
 * @author heshun
 * @create 2020-11-26-11:19
 **/
public class SimpleDateFormatTest {

    public static void main(String[] args) {

        /**
         * 1.实例化
         */
        // 采用默认的格式创建一个对象
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        // 采用参数pattern指定的格式创建一个对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        Date date1 = new Date();
        System.out.println(date1);

        /**
         * 2.格式化
         */
        // 默认格式化
        String formatDate1 = sdf1.format(date1);
        System.out.println(formatDate1);
        // 指定格式化
        String formatDate2 = sdf2.format(date1);
        System.out.println(formatDate2);
        System.out.println();

        /**
         * 3.解析
         */
        // 必须与SimpleDateFormat中的pattern指定的格式保持一致
        // 否则会出现ParseException
        String str = "2020年11月26日 11:50:00";
        try {
            // 会出现ParseException
            // Date date2 = sdf1.parse(str);
            Date date2 = sdf2.parse(str);
            System.out.println(date2.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
