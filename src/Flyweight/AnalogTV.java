package Flyweight;

class AnalogTV implements Client {

    private final String signal;
    private String channel;

    public AnalogTV(){
        signal = " --> analog signal";
    }

    public void assignChannel(String channel) {
        this.channel = channel;
    }

    public void provider() {
        System.out.println("AnalogTV with analog channels " + channel + " #Signal " + signal);
    }
}
