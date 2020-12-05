package priv.heshun.eight.collection;

import java.util.*;

/**
 * HashMap测试类
 *
 * @author heshun
 * @create 2020-12-05 10:21
 */
public class TreeMapTest {

    public static void main(String[] args) {
        // 学生成绩Map

        // 自然排序：按照姓名从大到小、年龄从小到大进行排序
        // 实现方式：所在类实现Comparable接口
        System.out.println("*******自然排序*******");
        Map<Student, Integer> gradeMap = new TreeMap<>();
        gradeMap.put(new Student("Newton", 18), 100);
        gradeMap.put(new Student("Zoe", 27), 98);
        gradeMap.put(new Student("Helen", 19), 58);
        gradeMap.put(new Student("Cherry", 22), 60);
        gradeMap.put(new Student("Marry", 45), 88);
        gradeMap.put(new Student("Alex", 16), 99);
        gradeMap.put(new Student("Alex", 15), 99);
        Set<Map.Entry<Student, Integer>> entries = gradeMap.entrySet();
        Iterator<Map.Entry<Student, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 定制排序：按照姓名从小到大、年龄从大到小进行排序
        // 实现方式：创建Comparator对象
        System.out.println("*******定制排序*******");
        Map<Student, Integer> gradeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1 instanceof Student && o2 instanceof Student) {
                    Student student1 = o1;
                    Student student2 = o2;
                    int compare = student1.getName().compareTo(student2.getName());
                    if(compare != 0) {
                        return compare;
                    } else {
                        return -Integer.compare(student1.getAge(), student2.getAge());
                    }
                } else {
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        });
        gradeMap2.put(new Student("Newton", 18), 100);
        gradeMap2.put(new Student("Zoe", 27), 98);
        gradeMap2.put(new Student("Helen", 19), 58);
        gradeMap2.put(new Student("Cherry", 22), 60);
        gradeMap2.put(new Student("Marry", 45), 88);
        gradeMap2.put(new Student("Alex", 16), 99);
        gradeMap2.put(new Student("Alex", 15), 99);
        Set<Map.Entry<Student, Integer>> entries2 = gradeMap2.entrySet();
        Iterator<Map.Entry<Student, Integer>> iterator2 = entries2.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

    }

}
