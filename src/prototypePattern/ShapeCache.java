package prototypePattern;

import sun.util.resources.cldr.ii.CalendarData_ii_CN;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap=new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cachedShape=shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    //对每种形状都运行数据库查询，并创建该形状
    public static void loadCache(){
        Circle cicle=new Circle();
        cicle.setId("1");
        shapeMap.put(cicle.getId(),cicle);

        Square square=new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
