package Bridge;

public class LED implements Display{
    @Override
    public void applyDisplay() {
        System.out.println("LED ");
    }
}
