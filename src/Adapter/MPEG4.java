package Adapter;

public class MPEG4 implements MediaSet {

    @Override
    public void playFile(String filename) {
        System.out.println("Playing MPEG4 File -> " + filename);
    }
}
