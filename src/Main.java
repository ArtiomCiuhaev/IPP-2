import Adapter.*;
import Bridge.*;
import Decorator.VisibilityDecorator;
import Decorator.Display;
import Decorator.TV;
import Decorator.BackDecorator;

public class Main {


    public static void main(String[] args) {

        System.out.println("ADAPTER");
        Player player = new MPEG2();
        player.play("file.mpeg2");
        player = new Adapter(new MPEG4());
        player.play("file.mpeg4");
        player = new Adapter(new AVC());
        player.play("file.avc");
        System.out.println("\n");

        System.out.println("BRIDGE");
        Manufacturer samsung = new Samsung(new OLED());
        samsung.applyDisplay();
        Manufacturer lg = new LG(new LCD());
        lg.applyDisplay();
        Manufacturer philips = new Philips(new LED());
        philips.applyDisplay();
        System.out.println("\n");

        System.out.println("DECORATOR");
        Display display = new BackDecorator(new VisibilityDecorator (new TV(50, "OMOLED")));
        display.decorate();
        System.out.println("\n");
    }
}