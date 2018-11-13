package Adapter;

public class Adapter implements Player{

    private MediaSet media;

    public Adapter (MediaSet m){
        media = m;
    }

    @Override
    public void play(String filename) {
        System.out.println("Using adapter :");
        media.playFile(filename);
    }
}
