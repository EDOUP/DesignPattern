package proxypattern;

public class ProxyPatternDemo {
    public static void main(String[] args){
        Image image =new ProxyImage("test.jpg");
        //图像将从磁盘加载
        image.display();
        //图像不需要磁盘加载
        image.display();
    }
}
