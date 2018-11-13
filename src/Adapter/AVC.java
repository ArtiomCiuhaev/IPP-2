package Adapter;

public class AVC implements MediaSet {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing AVC File -> " + filename);
    }
}
