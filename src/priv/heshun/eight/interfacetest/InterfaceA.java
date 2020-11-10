package priv.heshun.eight.interfacetest;

import java.util.jar.JarEntry;

/**
 * 接口A
 * @author heshun
 * @date 2020-11-10
 */
public interface InterfaceA {

    /**
     * 全局常量，其中public static final可省略
     */
    public static final int I = 0;
    int J = 1;

    /**
     * 抽象方法，其中ublic abstract可省略
     */
    public abstract void a();
    void b();

    /**
     * JDK8新特性：接口中可以定义静态方法
     */
    public static void c() {
        System.out.println("接口的方法c");
    };

    /**
     * JDK8新特性：接口中可以定义默认方法
     */
    public default void d() {
        System.out.println("接口的方法d");
    }

}
