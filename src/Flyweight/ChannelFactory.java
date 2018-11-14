package Flyweight;

import java.util.HashMap;

public class ChannelFactory {
    private static HashMap <String, Client> hm = new HashMap<String, Client>();

    public  static Client getClient(String type){
        Client c = null;
        if (hm.containsKey(type))
            c = hm.get(type);
        else{
            switch (type){
                case "AnalogTV": System.out.println("AnalogTV connected");
                c = new AnalogTV();
                break;
                case "DigitalTV": System.out.println("DigitalTV connected");
                c = new DigitalTV();
                break;
            }
            hm.put(type,c);
        }
        return c;
    }
}
