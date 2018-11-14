package Facade;

public class Seller {
    private TVShop samsung;
    private TVShop sony;
    private TVShop philips;

    public Seller (){
        samsung = new Samsung();
        sony = new Sony();
        philips = new Philips();
    }

    public void samsungSale(){
        samsung.id();
        samsung.price();
    }

    public void sonySale(){
        sony.id();
        sony.price();
    }

    public void philipsSale(){
        philips.id();
        philips.price();
    }
}
