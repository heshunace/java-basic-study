package priv.heshun.eight.collection;

import java.util.*;

/**
 * HashMap测试类
 *
 * 添加元素：put(key, value)
 * 删除元素：remove()，返回被删除的元素的value
 * 返回键的Set：keySet()
 * 返回值的Collection：values()
 * 返回entry(键值对)的Set：entrySet()
 * @author heshun
 * @create 2020-12-04-17:11
 **/
public class HashMapTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("AA", 123);
        // value相同，key不同
        map.put("BB", 124);
        map.put("CC", 124);
        // key相同，则用后一个value替换前一个value
        map.put("DD", 125);
        map.put("DD", 126);
        System.out.println(map);

        // 返回被删除的元素的value
        Integer removeValue = map.remove("DD");
        System.out.println(removeValue);
        System.out.println(map);

        // 遍历key
        System.out.println("*******遍历key*******");
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // 遍历value
        System.out.println("*******遍历value*******");
        Collection<Integer> values = map.values();
        System.out.println(values);

        // 遍历：方式一
        System.out.println("*******方式一遍历entry*******");
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println("key：" + key + "，value：" + value);
        }

        // 遍历：方式二
        System.out.println("*******方式二遍历entry*******");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
