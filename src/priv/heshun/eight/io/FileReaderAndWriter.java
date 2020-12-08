package priv.heshun.eight.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件字节流实现文本文件的读取和写出
 *
 * @author heshun
 * @create 2020-12-07-10:08
 **/
public class FileReaderAndWriter {
    public static void main(String[] args) {

        /*
            从文件读取
         */
        // 1.创建File类的对象
        File file = new File("C:\\Users\\heshu\\Desktop\\1.txt");
        // 2.创建流的对象
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            // 3.读入数据
            // 方式一：单个char读入
//            int data;
//            while((data = fileReader.read()) != -1) {
//                System.out.print((char) data);
//            }

            // 方式二：char数组读入
            int len;
            char[] data2 = new char[5];
            while((len = fileReader.read(data2)) != -1) {
                for(int i = 0; i < len; i++) {
                    System.out.print(data2[i]);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(fileReader != null) {
                try {
                    // 4.流的关闭
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        /*
            写出到文件
         */
        // 1.创建File类的对象
        File file2 = new File("C:\\Users\\heshu\\Desktop\\2.txt");
        // 2.创建流的对象
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file2);
            char[] data = new char[]{'1', '2', '3', '4', '5'};
            fileWriter.write(data);
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(fileWriter != null) {
                try {
                    // 4.流的关闭
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
