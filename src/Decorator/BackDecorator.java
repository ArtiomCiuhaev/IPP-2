package Decorator;

public class BackDecorator extends Decorator{
    public BackDecorator(Display display) {
        super(display);
    }

    public void decorate() {
        super.decorate();
        System.out.println(" Bla");
    }
}
