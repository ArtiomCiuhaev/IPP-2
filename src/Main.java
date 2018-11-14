import Adapter.*;
import Bridge.*;
import Decorator.VisibilityDecorator;
import Decorator.Display;
import Decorator.TV;
import Decorator.BackDecorator;
import Facade.Seller;
import Flyweight.ChannelFactory;
import Flyweight.Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static Flyweight.Provider.getRandChannel;
import static Flyweight.Provider.getRandClientType;

public class Main {

private static int choise;

    public static void main(String[] args) throws NumberFormatException, IOException {
        do {

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
            Display display = new BackDecorator(new VisibilityDecorator(new TV(50, "OMOLED")));
            display.decorate();
            System.out.println("\n");

            System.out.println("FLYWEIGHT");

            for (int i = 0; i < 10; i++)
            {
                Client c = ChannelFactory.getClient(getRandClientType());
                c.assignChannel(getRandChannel());
                c.provider();
            }
            System.out.println("\n");

            System.out.println("FACADE");
            System.out.println("--TVShop--");
            System.out.println(" 1.Samsung ");
            System.out.println(" 2.Sony ");
            System.out.println(" 3.Philips ");
            System.out.println(" 4.Exit \n");
            System.out.print(" Enter your choise: ");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choise = Integer.parseInt(br.readLine());
            Seller sl = new Seller();
            switch (choise) {
                case 1: {sl.samsungSale();}break;
                case 2: {sl.sonySale();}break;
                case 3: {sl.philipsSale();}break;
                default: { System.out.println(" Your basket is empty \n");}
            }

        }while (choise!=4);
    }

}