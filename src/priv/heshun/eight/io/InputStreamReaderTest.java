package priv.heshun.eight.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流，实现字节输入流到字符输入流的转换
 *
 * 字节输入流用于非文本文件的io，用于文本文件时会出现乱码问题
 * 而采用转换流将其转换为字符流后，则可实现对文本文件的io
 *
 * @author heshun
 * @create 2020-12-08-11:34
 **/
public class InputStreamReaderTest {
    public static void main(String[] args) {
        // 1.创建文件
        File file = new File("C:\\Users\\heshu\\Desktop\\1.txt");
        // 2.创建节点流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            // 3.创建处理流，将字节流转换为字符流
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            int len;
            char[] data = new char[5];
            // 4.读取文件
            while ((len = isr.read(data)) != -1) {
                for(int i = 0; i < len; i++) {
                    System.out.print(data[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5.关闭流
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
