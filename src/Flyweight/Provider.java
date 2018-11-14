package Flyweight;

import java.util.Random;

public class Provider {
    private static String[] clientType = {"AnalogTV", "DigitalTV"};
    private static String[] channels = {"Discovery", "RenTV", "Music", "Comedy"};

    public static String getRandClientType()
    {
        Random r = new Random();

        // Will return an integer between [0,2)
        int randInt = r.nextInt(clientType.length);

        // return the player stored at index 'randInt'
        return clientType[randInt];
    }
    public static String getRandChannel()
    {
        Random r = new Random();

        // Will return an integer between [0,5)
        int randInt = r.nextInt(channels.length);

        // Return the weapon stored at index 'randInt'
        return channels[randInt];
    }
}
