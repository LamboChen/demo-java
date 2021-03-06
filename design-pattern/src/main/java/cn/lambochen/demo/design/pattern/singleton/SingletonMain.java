package cn.lambochen.demo.design.pattern.singleton;

/**
 * @author lambo.chen.2306@gmail.com
 * @date 2020/7/21
 * @description 单例模式
 **/
public class SingletonMain {

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.doSomething();

        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }

}
