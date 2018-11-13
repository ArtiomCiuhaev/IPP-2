package Bridge;

public abstract class Manufacturer {
    protected Display display;

    public Manufacturer(Display display) {
        this.display = display;
    }

    abstract public void applyDisplay();
}
