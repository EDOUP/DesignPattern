package singletonpattern;

/**
 * 双检锁/双重校验锁（DCL）
 * 采用双锁机制，安全且多线程情况下保持高性能
 *
 */
public class Singleton3 {
    private volatile static Singleton3 singleton;
    private Singleton3(){}
    public static Singleton3 getInstance(){
        if(singleton==null){
            synchronized (Singleton3.class){
                if (singleton==null){
                    singleton=new Singleton3();
                }
            }
        }
        return singleton;
    }


}
