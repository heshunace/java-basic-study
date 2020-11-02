package priv.heshun.eight.array;

/**
 * 二维数组的默认值
 * @author heshun
 * @date 2020-11-03
 */
public class TwoDimensionalArrayDefault {

    public static void main(String[] args) {
        int[][] arr = new int[4][];

        // null
        System.out.println(arr[0]);

        // NullPointerException
        System.out.println(arr[0][0]);
    }

}
