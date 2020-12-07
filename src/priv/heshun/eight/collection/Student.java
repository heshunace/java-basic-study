package priv.heshun.eight.collection;

import java.util.Objects;

/**
 * 学生类
 *
 * @author heshun
 * @create 2020-12-05 10:21
 */
public class Student implements Comparable{

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("User equals()");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            int compare = -this.name.compareTo(student.name);
            if(compare != 0) {
                return compare;
            } else {
                return Integer.compare(this.age, student.age);
            }
        } else {
            throw new RuntimeException("输入的类型不匹配");
        }
    }
}
