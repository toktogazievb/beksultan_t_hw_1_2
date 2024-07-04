public class Sedan extends Car implements Printable {
    private int length;

    public Sedan(String model, int year, int price, double volume, int length) {
        super(model, year, price, volume);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void print() {
        System.out.println("\n" + this.getModel() + this.getYear() + " year\t"
                + "volume:" + this.getVolume() + "(l)\nPrice:" +
                this.getPrice() + " $\n" + (length > 5100 ? "Has a longed body." : "Has a usual body."));
    }
}
