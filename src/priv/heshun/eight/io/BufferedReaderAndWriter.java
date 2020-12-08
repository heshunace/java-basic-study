package priv.heshun.eight.io;

import java.io.*;

/**
 * 缓冲字节流实现文本文件的读取和写出
 *
 * @author heshun
 * @create 2020-12-08-10:56
 **/
public class BufferedReaderAndWriter {

    public static void main(String[] args) {
        /*
            从文件读取
         */
        // 1.创建文件
        File file = new File("C:\\Users\\heshu\\Desktop\\1.txt");
        File file2 = new File("C:\\Users\\heshu\\Desktop\\2.txt");
        // 2.创建流
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            // 3.创建处理流，并套接在节点流上
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file2);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // 4.读入数据

            // 方式一：单个char读入
            int data;
            while((data = bufferedReader.read()) != -1) {
                bufferedWriter.write(data);
                // 若未达到缓存的大小，需要手动调用flush
                // 若达到缓存的大小，则自动调用flush
                bufferedWriter.flush();
            }
            System.out.println("读取和写出完成");

            // 方式二：char数组读入
            int len;
            char[] data2 = new char[5];
            while((len = bufferedReader.read(data2)) != -1) {
                bufferedWriter.write(data2, 0 , len);
                bufferedWriter.flush();
            }
            System.out.println("读取和写出完成");

            // 方式三：整行读入
            String data3;
            while((data3 = bufferedReader.readLine()) != null) {
                bufferedWriter.write(data3 + "\n");
                bufferedWriter.flush();
            }
            System.out.println("读取和写出完成");

        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(fileReader != null) {
                // 4.流的关闭
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
