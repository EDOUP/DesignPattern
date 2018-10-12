package singletonpattern;

public class SingletonPatternDemo {
    public static void main(String[] args){
        //获取唯一可用对象
        //new  SingleObject() 报错
        //获取唯一可用对象
        SingleObject object=SingleObject.getInstance();
        object.showMessage();

        Singleton1 object1 =Singleton1.getInstance();
        object1.showMessage();

    }
}
