package priv.heshun.eight.io;

import java.io.*;

/**
 * 缓冲字符流实现非文本文件的读取和写出
 *
 * @author heshun
 * @create 2020-12-07-16:34
 **/
public class BufferedIsAndOs {

    public static void main(String[] args) {
        // 1.创建文件
        File file = new File("C:\\Users\\heshu\\Desktop\\夺金营救.mkv");
        File file2 = new File("C:\\Users\\heshu\\Desktop\\夺金营救2.mkv");
        // 2.创建节点流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(file);
            fos = new FileOutputStream(file2);
            // 3.创建处理流，并套接在节点流上
            BufferedInputStream bis = new BufferedInputStream(fis);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            // byte数组读入
            int len;
            byte[] data = new byte[1024];
            // 读入并写出
            System.out.println("开始读取和写出");
            long start = System.currentTimeMillis();
            while((len = bis.read(data)) != -1) {
                bos.write(data, 0 ,len);
            }
            long end = System.currentTimeMillis();
            System.out.println("读取和写出完成，耗时：" + (end - start));
            // 测试结果：1.64GB mkv文件，耗时14202
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 4.关闭流
            // 关闭外层流的同时，内层流也会自动进行关闭；故内层流的关闭可以省略
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
