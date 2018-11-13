package Bridge;

public class Samsung extends Manufacturer {
    public Samsung(Display display) {
        super(display);
    }

    @Override
    public void applyDisplay() {
        System.out.print("Samsung with display ");
        display.applyDisplay();
    }
}
