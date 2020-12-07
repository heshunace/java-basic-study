package priv.heshun.eight.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型通配符
 *
 * @author heshun
 * @create 2020-12-07-10:24
 **/
public class GenericsWildcard {

    public static void main(String[] args) {

        // 泛型继承关系：A是AA的父类，AA是AAA的父类
        // * 但List<A>并非List<AA>的父类
        List<A> listA = new ArrayList<>();
        List<AA> listAA = new ArrayList<>();
        List<AAA> listAAA = new ArrayList<>();
        // 以下语句编译报错
        // listA = listAA;

        List<?> listWildcard = new ArrayList<>();
        // 而使用通配符声明的listWildcard是List<A>、List<AA>、List<AAA>的父类
        listWildcard = listA;
        listWildcard = listAA;
        listWildcard = listAAA;

        // 而A<List>是AA<List>的父类
        A<List> a = new A<>();
        AA<List> aa = new AA<>();
        AAA<List> aaa = new AAA<>();
        a = aa;
        a = aaa;
        aa = aaa;

    }

}
