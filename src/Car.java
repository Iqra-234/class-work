public class Car {
    String brand;
    String model;
    double price;

    Car(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand );
        System.out.println("Model: " + model);
        System.out.println( "Price: $" + price);
    }
}

