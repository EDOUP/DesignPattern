package singletonpattern;

/**
 * 饿汉式 未lazy初始化，
 * 未加锁，执行效率会提高
 * 类加载是就初始化，浪费内存
 */
public class SingleObject {
    //创建SingleObject的一个对象
    private static SingleObject instance =new SingleObject();
    //让构造函数为private ，这样类不会实例化
    private SingleObject(){};
    //获取唯一可用对象
    public static SingleObject getInstance(){
        return instance;
    }

    public  void showMessage(){
        System.out.println("hello!");
    }
}
