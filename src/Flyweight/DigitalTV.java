package Flyweight;

class DigitalTV implements Client{

    private final String signal;
    private String channel;

    public DigitalTV(){
        signal = " --> digital signal";
    }

    public void assignChannel(String channel) {
        this.channel = channel;
    }

    public void provider() {
        System.out.println("DigitalTV with digital channels " + channel + " #Signal " + signal);
    }
}
