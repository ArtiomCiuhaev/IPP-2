package Adapter;

public class MPEG2 implements Player {

    @Override
    public void play(String filename) {
        System.out.println("Playing MPEG2 File -> " + filename);
    }
}
