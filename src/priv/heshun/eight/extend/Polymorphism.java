package priv.heshun.eight.extend;

/**
 * 多态性
 * @author heshun
 * @date 2020-11-07
 */
public class Polymorphism {

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println(parent.a);
        parent.b();

        // 多态性只适用于方法，不适用于属性
//        Parent child = new Child();
//        System.out.println(child.a);
//        child.b();
    }

}
