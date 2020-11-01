package priv.heshun.eight.algorithm;

/**
 * 10行以内的帕斯卡三角(杨辉三角)
 * @author heshun
 * @date 2020-11-01
 */
public class PascalsTriangleInTen {

    static int[][] a = new int[10][];

    public static void main(String[] args) {

        // 二维数组数组赋值
        for(int i = 0; i < a.length; i++) {

            a[i] = new int[i + 1];
            a[i][0] = 1;
            a[i][i] = 1;

            // 此处不需要判断i > 1，*for循环仅当判断条件成立时才执行
            for(int j = 1; j < a[i].length - 1; j++) {
                a[i][j] = a[i-1][j-1] + a[i-1][j];
            }
        }

        // 输出
        for(int i = 0; i < a.length; i++) {
            for(int space = 0; space < 10 - i - 1; space++) {
                System.out.print(" ");
            }
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
