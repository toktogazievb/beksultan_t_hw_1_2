public class Suv extends Car implements Printable {
    private String config;

    public Suv(String model, int year, int price, double volume, String config) {
        super(model, year, price, volume);
        this.config = config;
    }

    public String getConfig() {
        return config;
    }

    @Override
    public void print() {
        System.out.println("\n"+this.getModel() + this.getYear() + " year\t"
                + "volume:" + this.getVolume() + "(l)\nPrice:" +
                this.getPrice() + " $\n" + "Configuration: " + config);
    }
}
