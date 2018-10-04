package nullobjectpattern;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return "Not Avaliable in Customer Database";
    }
}
