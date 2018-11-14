package Facade;

public class Samsung implements TVShop{
    @Override
    public void id(){
        System.out.println(" Samsung smartTV 50'");
    }

    @Override
    public void price() {
        System.out.println(" 17000 MDL \n");
    }
}
