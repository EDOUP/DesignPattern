package singletonpattern;

/**
 * 懒汉式，线程安全
 * 能在多线程中很好的工作，但效率很低，99%不需要同步
 *加锁才能保证单例
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}

    public static synchronized Singleton2 getInstance(){
        if (instance==null){
            instance=new Singleton2();
        }
        return instance;
    }

    public  void showMessage(){
        System.out.println("懒汉式2，线程安全");
    }
}
