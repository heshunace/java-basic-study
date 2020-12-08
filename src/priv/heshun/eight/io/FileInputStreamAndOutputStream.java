package priv.heshun.eight.io;

import java.io.*;

/**
 * 文件字符流实现非文本文件的读取和写出
 *
 * @author heshun
 * @create 2020-12-07-16:32
 **/
public class FileInputStreamAndOutputStream {

    public static void main(String[] args) {
        // 1.创建文件
        File file = new File("C:\\Users\\heshu\\Desktop\\1.mkv");
        File file2 = new File("C:\\Users\\heshu\\Desktop\\2.mkv");
        // 2.创建流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2);
            // byte数组读入
            int len;
            byte[] data = new byte[1024];
            // 3.读入(并写出)数据
            System.out.println("开始读取和写出");
            long start = System.currentTimeMillis();
            while((len = fis.read(data)) != -1) {
                fos.write(data, 0 ,len);
            }
            long end = System.currentTimeMillis();
            System.out.println("读取和写出完成，耗时：" + (end - start));
            // 测试结果：1.64GB mkv文件，耗时20930
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
