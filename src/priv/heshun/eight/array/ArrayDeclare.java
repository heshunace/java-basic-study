package priv.heshun.eight.array;

/**
 * 数组声明
 * @author heshun
 * @date 2020-10-31
 */
public class ArrayDeclare {

    public static void main(String[] args) {

        // 数组的静态初始化
        int[] array1 = new int[]{1, 2, 3};

        // 数组的动态初始化
        int[] array2 = new int[3];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

        System.out.print("array1: ");
        print(array1);
        System.out.print("\n");
        System.out.print("array2: ");
        print(array2);

    }

    static void print(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}
