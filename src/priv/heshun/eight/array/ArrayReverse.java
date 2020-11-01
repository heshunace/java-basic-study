package priv.heshun.eight.array;

/**
 * 数组反转
 * @author heshun
 * @date 2020-11-01
 */
public class ArrayReverse {

    public static void main(String[] args) {
        int[] a = new int[]{2, 4, 6, 1, 3, 8, 5};
        ArrayDeclare.print(a);
        System.out.println();
        ArrayDeclare.print(reverse1(a));
        System.out.println();
        ArrayDeclare.print(reverse2(a));
    }

    /**
     * 反转方法1
     * @param a 原数组
     * @return 反转后的数组
     */
    static int[] reverse1(int[] a) {
        // 注意此处为a.length / 2
        // 否则进行了两次反转又重新还原了数组
        for(int i = 0; i < a.length / 2; i++) {
            int tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
        return a;
    }

    /**
     * 反转方法2
     * @param a 原数组
     * @return 反转后的数组
     */
    static int[] reverse2(int[] a) {
        for(int i = 0, j = a.length - 1; i < j; i++, j--) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }
        return a;
    }

}
