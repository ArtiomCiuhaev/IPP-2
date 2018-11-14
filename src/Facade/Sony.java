package Facade;

public class Sony implements TVShop{
    @Override
    public void id() {
        System.out.println(" Sony smartTV 65'");
    }

    @Override
    public void price() {
        System.out.println(" 19500 MDL \n");
    }
}
