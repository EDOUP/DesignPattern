package prototypePattern;

public class PrototypePatternDemo {

    public static void main(String[] args){
        ShapeCache.loadCache();
        Shape clonedShape1=ShapeCache.getShape("1");
        System.out.println("Shape:"+clonedShape1.getType());

        Shape cloneShape2=ShapeCache.getShape("2");
        System.out.println("Shape:"+cloneShape2.getType());

        Shape cloneShape3=ShapeCache.getShape("3");
        System.out.println("Shape:"+cloneShape3.getType());
    }
}
