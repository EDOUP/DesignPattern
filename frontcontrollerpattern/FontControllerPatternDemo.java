package frontcontrollerpattern;

public class FontControllerPatternDemo {
    public static void main(String[] args) {
        FontController fontController = new FontController();
        fontController.dispatherRequest("HOME");
        fontController.dispatherRequest("STUDENT");
    }
}
