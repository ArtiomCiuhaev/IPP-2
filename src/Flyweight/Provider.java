package Flyweight;

import java.util.Random;

public class Provider {
    private static String[] clientType = {"AnalogTV", "DigitalTV"};
    private static String[] channels = {"Discovery", "RenTV", "Music", "Comedy"};

    public static String getRandClientType()
    {
        Random r = new Random();

        int randInt = r.nextInt(clientType.length);

        return clientType[randInt];
    }
    public static String getRandChannel()
    {
        Random r = new Random();

        int randInt = r.nextInt(channels.length);

        return channels[randInt];
    }
}
