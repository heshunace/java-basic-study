package priv.heshun.eight.interfacetest;

public class SubClass extends ParentClassA implements InterfaceA {

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void d() {
        System.out.println("子类的方法d");
    }


    public void e() {
        // 调用子类自己的方法d
        d();
        // 调用父类的方法d
        super.d();
        // 调用接口的方法d(重难点！！！)
        InterfaceA.super.d();
    }

    public static void main(String[] args) {
        SubClass s = new SubClass();

        // 编译不通过，接口中的静态方法只能通过接口来调用，实现类无法获取
        // s.c();
        InterfaceA.c();

        // 接口中的默认方法可以被实现类的对象调用
        s.d();


        s.e();

    }
}
