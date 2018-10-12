package compositeentitypattern;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test","Data");
        client.printData();
        client.setData("Sencode","Data");
        client.printData();
    }
}
