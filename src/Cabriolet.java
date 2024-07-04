public class Cabriolet extends Car implements Printable {
    private boolean hasRoofOn;

    public Cabriolet(String model, int year, int price, double volume, boolean hasRoofOn) {
        super(model, year, price, volume);
        this.hasRoofOn = hasRoofOn;
    }

    public boolean isHasRoofOn() {
        return hasRoofOn;
    }

    @Override
    public void print() {
        System.out.println("\n" + this.getModel() + this.getYear() + " year\t"
                + "volume:" + this.getVolume() + "(l)\nPrice:" +
                this.getPrice() + " $\n" + ((hasRoofOn) ? "Has a roof." : "Has not a roof"));
    }
}
