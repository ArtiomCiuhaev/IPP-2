package Facade;

public class Philips implements TVShop {
    @Override
    public void id() {
        System.out.println(" Philips smartTV 70'");
    }

    @Override
    public void price() {
        System.out.println(" 22000 MDL \n");
    }
}
