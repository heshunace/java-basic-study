package priv.heshun.eight.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 去除List中的重复数字值
 *
 * @author heshun
 * @create 2020-12-03-16:59
 **/
public class DuplicateRemovalList {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(4);
        list1.add(4);
        list1.add(4);
        List<Integer> list2 = duplicateRemoval(list1);
        System.out.println(list2);
    }

    /**
     * 对list进行去重操作
     * @param originList 原list
     * @return 去重后的list
     */
    private static List<Integer> duplicateRemoval(List<Integer> originList) {
        // 利用Set数据结构“不可重复性”这一特性
        Set<Integer> set = new HashSet<>();
        set.addAll(originList);
        return new ArrayList<>(set);
    }
}
