package Decorator;

abstract class Decorator implements Display{
    private Display display;

    public Decorator(Display display) {
        this.display = display;
    }

    public void decorate() {
        display.decorate();
    }
}
