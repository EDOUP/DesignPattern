package singletonpattern;

/**
 * 懒汉式，线程不安全
 * 不支持多线程，多线程不能正常工作，没有加锁synchronized
 */
public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (instance==null){
            instance=new Singleton1();
        }
        return instance;
    }

    public  void showMessage(){
        System.out.println("懒汉式1，线程不安全");
    }
}
