package Bridge;

public class LG extends Manufacturer{

    public LG(Display display) {
        super(display);
    }

    @Override
    public void applyDisplay() {
        System.out.print("LG with display ");
        display.applyDisplay();
    }
}
