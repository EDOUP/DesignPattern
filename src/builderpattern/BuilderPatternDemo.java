package builderpattern;

public class BuilderPatternDemo {
    public static void main(String[] args){
        Mealbuilder mealbuilder=new Mealbuilder();
        Meal vegMeal=mealbuilder.prepareVegMeal();
        System.out.println("veg Meal:");
        vegMeal.showItem();
        System.out.println("Total Cost:" +vegMeal.getCost());

        Meal nonVegMeal=mealbuilder.prepareNonVegMeal();
        System.out.println("\nNon-Veg Meal");
        nonVegMeal.showItem();
        System.out.println("Total Cost:"+nonVegMeal.getCost());
    }
}
