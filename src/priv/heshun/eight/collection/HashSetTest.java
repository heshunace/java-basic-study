package priv.heshun.eight.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author heshun
 * @create 2020-12-05 11:21
 */
public class HashSetTest {

    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();
        set.add(new Student("Alex", 16));
        set.add(new Student("Alex", 16));
        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
