package priv.heshun.eight.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 有限制条件的泛型通配符
 *
 * @author heshun
 * @create 2020-12-07-10:48
 **/
public class ConditionalGenericsWildcard {

    public static void main(String[] args) {

        List<Object> listO = new ArrayList<>();
        List<A> listA = new ArrayList<>();
        List<AA> listAA = new ArrayList<>();
        List<AAA> listAAA = new ArrayList<>();

        // list1的子类为List<AA>和List<AA的子类>，即范围为(-∞,AA]
        List<? extends AA> list1 = new ArrayList<>();
        list1 = listAA;
        list1 = listAAA;
        // 以下语句编译报错
        // list1 = listA;
        // list1 = listO;

        // list2的子类为List<AA>和List<AA的父类>，即范围为[AA,Object]
        List<? super AA> list2 = new ArrayList<>();
        list2 = listAA;
        list2 = listA;
        list2 = listO;
        // 以下语句编译报错
        // list2= listAAA;
    }

}
