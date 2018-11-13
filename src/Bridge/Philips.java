package Bridge;

public class Philips extends Manufacturer {
    public Philips(Display display) {
        super(display);
    }

    @Override
    public void applyDisplay() {
        System.out.print("Philips with display ");
        display.applyDisplay();
    }
}
