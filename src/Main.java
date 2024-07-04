public class Main {
    public static Car createObject(String className) {
        switch (className) {
            case "2й":
                return new Suv("Kia Sportage", 2018, 20000, 2.5, "Se");
            case "3й":
                return new Sedan("Audi A8L", 2020, 79999, 6.2, 5345);
            case "4й":
                return new Cabriolet("Porsche 911", 2023, 150000, 4, false);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Car kiaSportage = createObject("2й");
        Car audiA8L = createObject("3й");
        Car porsche911 = createObject("4й");

        Car[] cars = {kiaSportage, audiA8L, porsche911};
        for (int i = 0; i < cars.length; i++) {
            ((Printable)cars[i]).print();
        }
    }
}