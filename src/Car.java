public class Car {
    private String model;
    private int year, price;
    private double volume;

    public Car(String model, int year, int price, double volume) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.volume = volume;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }
}
