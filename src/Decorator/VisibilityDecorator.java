package Decorator;

public class VisibilityDecorator extends Decorator{
    public VisibilityDecorator(Display display) {
        super(display);
    }

    public void decorate() {
        super.decorate();
        System.out.println(" #Attach webcam");
    }
}
