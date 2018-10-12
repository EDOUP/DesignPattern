package singletonpattern;

/**
 * 登记类/静态内部类
 * 能达到双检锁方式一样的功效，但实现更简单
 */
public class Singleton4 {
    private static class SingletonHolder{
        private static final Singleton4 INSTANCE =new Singleton4();
    }
    private Singleton4(){}

    public static final Singleton4 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
