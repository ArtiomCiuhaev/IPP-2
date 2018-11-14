package Decorator;

public class TV implements Display {
        private int size;
        private String type;

        public TV(int size, String type) {
            this.size = size;
            this.type = type;
        }

        @Override
        public void decorate() {
            System.out.println(" - size " + size + "inch" + "\n" +
                    " - screen type " + type + "\n" +
                    "\n Decorate: ");
        }
}
