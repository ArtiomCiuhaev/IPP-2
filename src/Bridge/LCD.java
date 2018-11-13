package Bridge;

public class LCD implements Display {
    @Override
    public void applyDisplay() {
        System.out.println("LCD ");
    }
}
