package priv.heshun.eight.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型方法
 * 利用<T>表示自己是一个泛型方法
 *
 * @author heshun
 * @create 2020-12-07-9:18
 **/
public class GenericsMethod {

    /**
     * 从数组复制到List
     * 其中<T>表示自己是一个泛型方法
     * @param a 数组
     * @param <T> 泛型
     * @return 复制的List
     */
    public static <T> List<T> copyFromArrayToList(T[] a) {
        List<T> list = new ArrayList<>();
        for (T t : a) {
            list.add(t);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        Integer[] b = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        // 报错，泛型只支持引用数据类型，下面语句编译报错
        // copyFromArrayToList(a);
        List<Integer> list = copyFromArrayToList(b);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
