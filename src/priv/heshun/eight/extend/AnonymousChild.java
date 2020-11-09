package priv.heshun.eight.extend;

/**
 * 匿名子类对象
 * @author heshun
 * @date 2020-11-09
 */
public class AnonymousChild {

    public static void print(AbstractParent p) {
        p.b();
    }

    public static void main(String[] args) {

        // 非匿名子类的非匿名对象
        AbstractParent child = new Child();
        print(child);

        // 非匿名子类的匿名对象
        print(new Child());

        //匿名子类的非匿名对象
        AbstractParent anonymousChild = new AbstractParent() {
            @Override
            public void b() {
                System.out.println("匿名子类1的方法");
            }
        };
        print(anonymousChild);

        // 匿名子类的匿名对象
        print(new AbstractParent() {
            @Override
            public void b() {
                System.out.println("匿名子类2的方法");
            }
        });
    }

}
